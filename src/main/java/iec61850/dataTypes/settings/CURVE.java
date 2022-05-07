package iec61850.dataTypes.settings;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class CURVE extends DATA {

    private DataAttribute<Float> setCharact = new DataAttribute<>((float) 0);
    private DataAttribute<Float> setParA = new DataAttribute<>((float) 0);
    private DataAttribute<Float> setParB = new DataAttribute<>((float) 0);
    private DataAttribute<Float> setParC = new DataAttribute<>((float) 0);
    private DataAttribute<Float> setParD = new DataAttribute<>((float) 0);
    private DataAttribute<Float> setParE = new DataAttribute<>((float) 0);
    private DataAttribute<Float> setParF = new DataAttribute<>((float) 0);

    public DataAttribute<Float> getSetCharact() {
        return setCharact;
    }

    public void setSetCharact(DataAttribute<Float> setCharact) {
        this.setCharact = setCharact;
    }

    public DataAttribute<Float> getSetParA() {
        return setParA;
    }

    public void setSetParA(DataAttribute<Float> setParA) {
        this.setParA = setParA;
    }

    public DataAttribute<Float> getSetParB() {
        return setParB;
    }

    public void setSetParB(DataAttribute<Float> setParB) {
        this.setParB = setParB;
    }

    public DataAttribute<Float> getSetParC() {
        return setParC;
    }

    public void setSetParC(DataAttribute<Float> setParC) {
        this.setParC = setParC;
    }

    public DataAttribute<Float> getSetParD() {
        return setParD;
    }

    public void setSetParD(DataAttribute<Float> setParD) {
        this.setParD = setParD;
    }

    public DataAttribute<Float> getSetParE() {
        return setParE;
    }

    public void setSetParE(DataAttribute<Float> setParE) {
        this.setParE = setParE;
    }

    public DataAttribute<Float> getSetParF() {
        return setParF;
    }

    public void setSetParF(DataAttribute<Float> setParF) {
        this.setParF = setParF;
    }
}
