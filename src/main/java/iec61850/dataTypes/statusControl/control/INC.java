package iec61850.dataTypes.statusControl.control;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class INC extends DATA {
    private DataAttribute<Integer> ctlVal = new DataAttribute<>(0);
    private DataAttribute<Integer> ctlNum = new DataAttribute<>(0);
    private DataAttribute<Boolean> stVal = new DataAttribute<>(false);
    private DataAttribute<Boolean> stSeld = new DataAttribute<>(false);
    private DataAttribute<Boolean> subEna = new DataAttribute<>(false);
    private DataAttribute<Integer> subVal = new DataAttribute<>(0);

    public DataAttribute<Integer> getCtlVal() {
        return ctlVal;
    }

    public void setCtlVal(DataAttribute<Integer> ctlVal) {
        this.ctlVal = ctlVal;
    }

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

    public DataAttribute<Integer> getSubVal() {
        return subVal;
    }

    public void setSubVal(DataAttribute<Integer> subVal) {
        this.subVal = subVal;
    }
}
