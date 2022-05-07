package iec61850.dataTypes.common;

public class LPL extends DATA {
    private String vendor;
    private String swRev;
    private String d;
    private String dU;
    private String configRev;
    private String IdNs;
    private String InNs;
    private String cdcNs;
    private String cdcName;
    private String dataNs;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getSwRev() {
        return swRev;
    }

    public void setSwRev(String swRev) {
        this.swRev = swRev;
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

    public String getConfigRev() {
        return configRev;
    }

    public void setConfigRev(String configRev) {
        this.configRev = configRev;
    }

    public String getIdNs() {
        return IdNs;
    }

    public void setIdNs(String idNs) {
        IdNs = idNs;
    }

    public String getInNs() {
        return InNs;
    }

    public void setInNs(String inNs) {
        InNs = inNs;
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
}
