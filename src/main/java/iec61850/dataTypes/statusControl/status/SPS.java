package iec61850.dataTypes.statusControl.status;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class SPS  extends DATA {
    private DataAttribute<Boolean> stVal = new DataAttribute<>(false);
    private DataAttribute<Boolean> subEna = new DataAttribute<>(false);
    private DataAttribute<Boolean> subVal = new DataAttribute<>(false);

    public DataAttribute<Boolean> getStVal() {
        return stVal;
    }

    public void setStVal(DataAttribute<Boolean> stVal) {
        this.stVal = stVal;
    }

    public DataAttribute<Boolean> getSubEna() {
        return subEna;
    }

    public void setSubEna(DataAttribute<Boolean> subEna) {
        this.subEna = subEna;
    }

    public DataAttribute<Boolean> getSubVal() {
        return subVal;
    }

    public void setSubVal(DataAttribute<Boolean> subVal) {
        this.subVal = subVal;
    }
}
