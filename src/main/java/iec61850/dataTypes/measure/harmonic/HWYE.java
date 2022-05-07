package iec61850.dataTypes.measure.harmonic;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;
import iec61850.dataTypes.common.Vector;

import java.util.ArrayList;
import java.util.List;

public class HWYE extends DATA {

    private List<Vector> phsAHar = new ArrayList<>();
    private List<Vector> phsBHar = new ArrayList<>();
    private List<Vector> phsCHar = new ArrayList<>();
    private List<Vector> neutHar = new ArrayList<>();
    private List<Vector> netHar = new ArrayList<>();
    private List<Vector> resHar = new ArrayList<>();
    private DataAttribute<Integer> numHar = new DataAttribute<>(0);
    private DataAttribute<Integer> numCyc = new DataAttribute<>(0);
    private DataAttribute<Integer> evalTm = new DataAttribute<>(0);
    private DataAttribute<Integer> smpRate = new DataAttribute<>(0);
    private DataAttribute<Float> frequency = new DataAttribute<>((float) 0);
    private DataAttribute<Integer> rmsCyc = new DataAttribute<>(0);

    public List<Vector> getPhsAHar() {
        return phsAHar;
    }

    public void setPhsAHar(List<Vector> phsAHar) {
        this.phsAHar = phsAHar;
    }

    public List<Vector> getPhsBHar() {
        return phsBHar;
    }

    public void setPhsBHar(List<Vector> phsBHar) {
        this.phsBHar = phsBHar;
    }

    public List<Vector> getPhsCHar() {
        return phsCHar;
    }

    public void setPhsCHar(List<Vector> phsCHar) {
        this.phsCHar = phsCHar;
    }

    public List<Vector> getNeutHar() {
        return neutHar;
    }

    public void setNeutHar(List<Vector> neutHar) {
        this.neutHar = neutHar;
    }

    public List<Vector> getNetHar() {
        return netHar;
    }

    public void setNetHar(List<Vector> netHar) {
        this.netHar = netHar;
    }

    public List<Vector> getResHar() {
        return resHar;
    }

    public void setResHar(List<Vector> resHar) {
        this.resHar = resHar;
    }

    public DataAttribute<Integer> getNumHar() {
        return numHar;
    }

    public void setNumHar(DataAttribute<Integer> numHar) {
        this.numHar = numHar;
    }

    public DataAttribute<Integer> getNumCyc() {
        return numCyc;
    }

    public void setNumCyc(DataAttribute<Integer> numCyc) {
        this.numCyc = numCyc;
    }

    public DataAttribute<Integer> getEvalTm() {
        return evalTm;
    }

    public void setEvalTm(DataAttribute<Integer> evalTm) {
        this.evalTm = evalTm;
    }

    public DataAttribute<Integer> getSmpRate() {
        return smpRate;
    }

    public void setSmpRate(DataAttribute<Integer> smpRate) {
        this.smpRate = smpRate;
    }

    public DataAttribute<Float> getFrequency() {
        return frequency;
    }

    public void setFrequency(DataAttribute<Float> frequency) {
        this.frequency = frequency;
    }

    public DataAttribute<Integer> getRmsCyc() {
        return rmsCyc;
    }

    public void setRmsCyc(DataAttribute<Integer> rmsCyc) {
        this.rmsCyc = rmsCyc;
    }
}
