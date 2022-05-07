package iec61850.dataTypes.measure.harmonic;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;
import iec61850.dataTypes.common.Vector;

import java.util.ArrayList;
import java.util.List;

public class HMV extends DATA {
    private List<Vector> har = new ArrayList<>();
    private DataAttribute<Integer> numHar = new DataAttribute<>(0);
    private DataAttribute<Integer> numCyc = new DataAttribute<>(0);
    private DataAttribute<Integer> evalTm = new DataAttribute<>(0);
    private DataAttribute<Integer> smpRate = new DataAttribute<>(0);
    private DataAttribute<Float> frequency = new DataAttribute<>((float) 0);
    private DataAttribute<Integer> rmsCyc = new DataAttribute<>(0);

    public List<Vector> getHar() {
        return har;
    }

    public void setHar(List<Vector> har) {
        this.har = har;
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
