package iec61850.dataTypes.common;

public class DPL extends DATA{
    private String vendor;
    private String hwRev;
    private String swRev;
    private String serNum;
    private String model;
    private String location;
    private String cdcNs;
    private String cdcName;
    private String dataNs;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getHwRev() {
        return hwRev;
    }

    public void setHwRev(String hwRev) {
        this.hwRev = hwRev;
    }

    public String getSwRev() {
        return swRev;
    }

    public void setSwRev(String swRev) {
        this.swRev = swRev;
    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
