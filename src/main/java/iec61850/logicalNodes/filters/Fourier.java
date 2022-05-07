package iec61850.logicalNodes.filters;

import iec61850.dataTypes.common.DataAttribute;
import iec61850.logicalNodes.common.Filter;

import java.util.ArrayList;
import java.util.LinkedList;

/** Реализация фильтра фурье */

public class Fourier extends Filter {

    private final int NUMBER_OF_SAMPLES; // Количество выборок за период
    private final LinkedList<Float> values = new LinkedList<>(); // Лист получаемых значений, длина равна количеству выборок
    private final ArrayList<Double> sinBuffer = new ArrayList<>(); // Значения синуса, длина равна количеству выборок
    private final ArrayList<Double> cosBuffer = new ArrayList<>(); // Значение косинуса, длина равна количеству выборок
    private Double sumX = 0.; // Значение суммы по Х
    private Double sumY = 0.; // Значение суммы по Y
    private int counter; // Счетчик


    /** Публичный конструктор, в качестве аргумента принимает количество выборок.
    * Инициализирует начальные выходные значения, количество выборок, рассчитывает
    * значения синуса и косинуса */

    public Fourier(int numberOfSamples) {
        super();
        this.getOutputInstVal().setMag(new DataAttribute<>(0.));
        this.getOutputInstVal().setAng(new DataAttribute<>(0.));
        this.getOutputVal().setMag(new DataAttribute<>(0.));
        this.getOutputVal().setAng(new DataAttribute<>(0.));
        this.NUMBER_OF_SAMPLES = numberOfSamples;
        for (int i = 0; i < NUMBER_OF_SAMPLES; i++) {
            double radians = 2 * Math.PI * i / NUMBER_OF_SAMPLES;
            this.sinBuffer.add(Math.sin(radians));
            this.cosBuffer.add(Math.cos(radians));
        }
    }

    /** Метод фильтрует значения по заданному алгоритму */

    @Override
    public void process() {
        this.values.add(this.getInput().getInstMag().getValue());
        if (this.values.size() > NUMBER_OF_SAMPLES) {
            double firstElement = this.values.pollFirst();
            this.sumX -= firstElement * this.sinBuffer.get(counter%NUMBER_OF_SAMPLES);
            this.sumY -= firstElement * this.cosBuffer.get(counter%NUMBER_OF_SAMPLES);
        }
        this.sumX += this.getInput().getInstMag().getValue() * this.sinBuffer.get(counter%NUMBER_OF_SAMPLES);
        this.sumY += this.getInput().getInstMag().getValue() * this.cosBuffer.get(counter%NUMBER_OF_SAMPLES);
        double xProjection = this.sumX * 2 / NUMBER_OF_SAMPLES;
        double yProjection = this.sumY * 2 / NUMBER_OF_SAMPLES;
        double magnitude = Math.sqrt(xProjection * xProjection + yProjection * yProjection);
        double angle = Math.atan(yProjection / xProjection);
        this.getOutputInstVal().getMag().setValue(magnitude);
        this.getOutputInstVal().getAng().setValue(Math.toDegrees(angle));
        this.getOutputVal().getMag().setValue(magnitude/Math.sqrt(2));
        counter++;
    }
}
