package iec61850.dataTypes.statusControl.control;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Недублированное управление и состояние */

public class SPC extends DATA {
    private DataAttribute<Integer> ctlNum = new DataAttribute<>(0);
    private DataAttribute<Boolean> stVal = new DataAttribute<>(false);
    private DataAttribute<Boolean> stSeld = new DataAttribute<>(false);
    private DataAttribute<Boolean> subEna = new DataAttribute<>(false);
    private DataAttribute<Boolean> subVal = new DataAttribute<>(false);

    public DataAttribute<Integer> getCtlNum() {
        return ctlNum;
    }

    public void setCtlNum(DataAttribute<Integer> ctlNum) {
        this.ctlNum = ctlNum;
    }

    public DataAttribute<Boolean> getStVal() {
        return stVal;
    }

    public void setStVal(DataAttribute<Boolean> stVal) {
        this.stVal = stVal;
    }

    public DataAttribute<Boolean> getStSeld() {
        return stSeld;
    }

    public void setStSeld(DataAttribute<Boolean> stSeld) {
        this.stSeld = stSeld;
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
