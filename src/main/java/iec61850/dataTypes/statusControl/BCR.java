package iec61850.dataTypes.statusControl;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Считывание показаний двоичного счетчика */

public class BCR extends DATA {
    private DataAttribute<Integer> actVal = new DataAttribute<>(0);
    private DataAttribute<Integer> frVal = new DataAttribute<>(0);
    private DataAttribute<Float> pulsQty = new DataAttribute<>((float) 0.);
    private DataAttribute<Boolean> frEna = new DataAttribute<>(false);
    private DataAttribute<Integer> frPd = new DataAttribute<>(0);
    private DataAttribute<Boolean> frRs = new DataAttribute<>(false);
    private String d;
    private String dU;
    private String cdcNs;
    private String cdcName;
    private String dataNs;

    public DataAttribute<Float> getPulsQty() {
        return pulsQty;
    }

    public void setPulsQty(DataAttribute<Float> pulsQty) {
        this.pulsQty = pulsQty;
    }

    public DataAttribute<Boolean> getFrEna() {
        return frEna;
    }

    public void setFrEna(DataAttribute<Boolean> frEna) {
        this.frEna = frEna;
    }

    public DataAttribute<Integer> getFrPd() {
        return frPd;
    }

    public void setFrPd(DataAttribute<Integer> frPd) {
        this.frPd = frPd;
    }

    public DataAttribute<Boolean> getFrRs() {
        return frRs;
    }

    public void setFrRs(DataAttribute<Boolean> frRs) {
        this.frRs = frRs;
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

    public DataAttribute<Integer> getActVal() {
        return actVal;
    }

    public void setActVal(DataAttribute<Integer> actVal) {
        this.actVal = actVal;
    }

    public DataAttribute<Integer> getFrVal() {
        return frVal;
    }

    public void setFrVal(DataAttribute<Integer> frVal) {
        this.frVal = frVal;
    }
}
