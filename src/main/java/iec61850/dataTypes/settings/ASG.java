package iec61850.dataTypes.settings;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Создание значения аналогового сигнала */

public class ASG extends DATA {

    private DataAttribute<Double> setMag = new DataAttribute<>(null);
    private DataAttribute<Double> minVal = new DataAttribute<>(null);
    private DataAttribute<Double> maxVal = new DataAttribute<>(null);
    private DataAttribute<Double> stepSize = new DataAttribute<>(null);

    public DataAttribute<Double> getSetMag() {
        return setMag;
    }

    public void setSetMag(DataAttribute<Double> setMag) {
        this.setMag = setMag;
    }

    public DataAttribute<Double> getMinVal() {
        return minVal;
    }

    public void setMinVal(DataAttribute<Double> minVal) {
        this.minVal = minVal;
    }

    public DataAttribute<Double> getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(DataAttribute<Double> maxVal) {
        this.maxVal = maxVal;
    }

    public DataAttribute<Double> getStepSize() {
        return stepSize;
    }

    public void setStepSize(DataAttribute<Double> stepSize) {
        this.stepSize = stepSize;
    }
}
