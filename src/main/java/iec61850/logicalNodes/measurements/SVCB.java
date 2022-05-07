package iec61850.logicalNodes.measurements;

import iec61850.dataTypes.measure.SAV;
import iec61850.logicalNodes.common.LN;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/** Узел для считывания comtrade файлов */

public class SVCB extends LN {

    private List<String> cfgFileLines = new LinkedList<>(); // Строки файла cfg
    private List<String> datFileLines = new LinkedList<>(); // Строки файла dat
    private Iterator<String> iterator; // Итератор по строкам dat
    private final ArrayList<SAV> signals = new ArrayList<>(); // Полученные сигналы
    private final ArrayList<Float> aBuffer = new ArrayList<>(); // Коэффициенты а для каждого сигнала
    private final ArrayList<Float> bBuffer = new ArrayList<>(); // Коэффициенты b для каждого сигнала
    private int signalsQuantity; // Количество сигналов

    /** Метод берет строку, выделяет из нее значения сигналов и считает их */

    @Override
    public void process() {
        String line = iterator.next();
        List<String> signalList = Arrays.asList(line.split(",").clone()).subList(2, 2 + this.signalsQuantity);
        for (int i = 0; i < aBuffer.size(); i++) {
            this.signals.get(i).getInstMag().setValue(Float.parseFloat(signalList.get(i)) * aBuffer.get(i) + bBuffer.get(i));
        }
    }

    /** Метод считывает comtrade файл, в качестве аргумента принимает путь до файла */

    public void readComtrade(String pathCfg) {
        String pathDat = pathCfg.replace(".cfg", ".dat");
        try {
            File fileCfg = new File(pathCfg);
            File fileDat = new File(pathDat);
            FileReader fr = new FileReader(fileCfg);
            FileReader fr1 = new FileReader(fileDat);
            BufferedReader readerCfg = new BufferedReader(fr);
            BufferedReader readerDat = new BufferedReader(fr1);
            readerCfg.lines().forEach(el -> cfgFileLines.add(el));
            readerDat.lines().forEach(el -> datFileLines.add(el));
            iterator = datFileLines.iterator();
            this.signalsQuantity = cfgFileLines.size()-9;
            System.out.println("Файл считан, количество сигналов: " + this.signalsQuantity
                    + ", количество выборок: " + datFileLines.size());
            parseCfg();
            for (int i = 0; i < this.signalsQuantity; i++) {
                this.signals.add(new SAV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Метод выделяет коэффициенты а и b из cfg файла */

    private void parseCfg() {
        List<String> signals = this.cfgFileLines.subList(2, 2 + this.signalsQuantity);
        List<String> analogSignals = signals.stream().filter(el -> el.split(",").length == signals.get(2).split(",").length)
                .collect(Collectors.toList());
        analogSignals.forEach(el -> this.aBuffer.add(Float.parseFloat(el.split(",")[5])));
        analogSignals.forEach(el -> this.bBuffer.add(Float.parseFloat(el.split(",")[6])));
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public ArrayList<SAV> getSignals() {
        return this.signals;
    }


}
