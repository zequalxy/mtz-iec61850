package iec61850.dataTypes.statusControl;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class APC extends DATA {
    private DataAttribute<?> setMag = new DataAttribute<>(null);
    private DataAttribute<?> minVal = new DataAttribute<>(null);
    private DataAttribute<?> maxVal = new DataAttribute<>(null);
    private DataAttribute<?> stepSize = new DataAttribute<>(null);

    public DataAttribute<?> getSetMag() {
        return setMag;
    }

    public void setSetMag(DataAttribute<?> setMag) {
        this.setMag = setMag;
    }

    public DataAttribute<?> getMinVal() {
        return minVal;
    }

    public void setMinVal(DataAttribute<?> minVal) {
        this.minVal = minVal;
    }

    public DataAttribute<?> getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(DataAttribute<?> maxVal) {
        this.maxVal = maxVal;
    }

    public DataAttribute<?> getStepSize() {
        return stepSize;
    }

    public void setStepSize(DataAttribute<?> stepSize) {
        this.stepSize = stepSize;
    }
}
