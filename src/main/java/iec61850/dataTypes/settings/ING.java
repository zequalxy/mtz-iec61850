package iec61850.dataTypes.settings;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Установка состояния целочисленная */

public class ING extends DATA {

    private DataAttribute<Integer> setVal = new DataAttribute<>(0);
    private DataAttribute<Integer> minVal = new DataAttribute<>(0);
    private DataAttribute<Integer> maxVal = new DataAttribute<>(0);
    private DataAttribute<Integer> stepSize = new DataAttribute<>(0);

    public DataAttribute<Integer> getSetVal() {
        return setVal;
    }

    public void setSetVal(DataAttribute<Integer> setVal) {
        this.setVal = setVal;
    }

    public DataAttribute<Integer> getMinVal() {
        return minVal;
    }

    public void setMinVal(DataAttribute<Integer> minVal) {
        this.minVal = minVal;
    }

    public DataAttribute<Integer> getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(DataAttribute<Integer> maxVal) {
        this.maxVal = maxVal;
    }

    public DataAttribute<Integer> getStepSize() {
        return stepSize;
    }

    public void setStepSize(DataAttribute<Integer> stepSize) {
        this.stepSize = stepSize;
    }
}
