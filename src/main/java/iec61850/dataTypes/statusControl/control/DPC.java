package iec61850.dataTypes.statusControl.control;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Дублированное управление и состояние */

public class DPC extends DATA {
    private DataAttribute<Boolean> ctlVal = new DataAttribute<>(true);
    private Enum<State> stVal = State.ON;
    private DataAttribute<Boolean> stSeld = new DataAttribute<>(false);
    private DataAttribute<Boolean> subEna = new DataAttribute<>(false);

    public enum State {
        INTERMEDIATE_STATE, OFF, ON, BAD_STATE;
    }

    public DataAttribute<Boolean> getCtlVal() {
        return ctlVal;
    }

    public void setCtlVal(DataAttribute<Boolean> ctlVal) {
        this.ctlVal = ctlVal;
    }

    public Enum<State> getStVal() {
        return stVal;
    }

    public void setStVal(Enum<State> stVal) {
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
}
