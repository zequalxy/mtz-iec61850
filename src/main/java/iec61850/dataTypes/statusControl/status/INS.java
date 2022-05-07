package iec61850.dataTypes.statusControl.status;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Целочисленное состояние */

public class INS extends DATA {

    private DataAttribute<Integer> stVal = new DataAttribute<>(0);
    private DataAttribute<Boolean> subEna = new DataAttribute<>(false);
    private DataAttribute<Integer> subVal = new DataAttribute<>(0);
    private String subID;
    private String d;
    private String dU;
    private String cdcNs;
    private String cdcName;
    private String dataNs;

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getdU() {
        return dU;
    }

    public void setdU(String dU) {
        this.dU = dU;
    }

    public String getCdcNs() {
        return cdcNs;
    }

    public void setCdcNs(String cdcNs) {
        this.cdcNs = cdcNs;
    }

    public String getCdcName() {
        return cdcName;
    }

    public void setCdcName(String cdcName) {
        this.cdcName = cdcName;
    }

    public String getDataNs() {
        return dataNs;
    }

    public void setDataNs(String dataNs) {
        this.dataNs = dataNs;
    }

    public DataAttribute<Integer> getStVal() {
        return stVal;
    }

    public void setStVal(DataAttribute<Integer> stVal) {
        this.stVal = stVal;
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
