package iec61850.dataTypes.statusControl.control;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class ISC extends DATA {

    private DataAttribute<Integer> ctlNum = new DataAttribute<>(0);
    private DataAttribute<Integer> ctlVal = new DataAttribute<>(0);
    private DataAttribute<Boolean> stSeld = new DataAttribute<>(false);
    private DataAttribute<Boolean> subEna = new DataAttribute<>(false);

    public DataAttribute<Integer> getCtlNum() {
        return ctlNum;
    }

    public void setCtlNum(DataAttribute<Integer> ctlNum) {
        this.ctlNum = ctlNum;
    }

    public DataAttribute<Integer> getCtlVal() {
        return ctlVal;
    }

    public void setCtlVal(DataAttribute<Integer> ctlVal) {
        this.ctlVal = ctlVal;
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
}
