package iec61850.dataTypes.measure;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;
import iec61850.dataTypes.measure.vector.CMV;

/** Измеряемые значения */

public class MV extends DATA {

    private DataAttribute<?> instMag = new DataAttribute<>(null);
    private DataAttribute<?> mag = new DataAttribute<>(null);
    private Enum<CMV.Range> range = CMV.Range.NORMAL;
    private DataAttribute<Boolean> subEna;
    private DataAttribute<Float> subMag;
    private String subID;
    private DataAttribute<Integer> db;
    private DataAttribute<Integer> zeroDb;
    private DataAttribute<Integer> smpRate;
    private String d;
    private String dU;
    private String cdcNs;
    private String cdcName;
    private String dataNs;

    public Enum<CMV.Range> getRange() {
        return range;
    }

    public void setRange(Enum<CMV.Range> range) {
        this.range = range;
    }

    public DataAttribute<Boolean> getSubEna() {
        return subEna;
    }

    public void setSubEna(DataAttribute<Boolean> subEna) {
        this.subEna = subEna;
    }

    public DataAttribute<Float> getSubMag() {
        return subMag;
    }

    public void setSubMag(DataAttribute<Float> subMag) {
        this.subMag = subMag;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public DataAttribute<Integer> getDb() {
        return db;
    }

    public void setDb(DataAttribute<Integer> db) {
        this.db = db;
    }

    public DataAttribute<Integer> getZeroDb() {
        return zeroDb;
    }

    public void setZeroDb(DataAttribute<Integer> zeroDb) {
        this.zeroDb = zeroDb;
    }

    public DataAttribute<Integer> getSmpRate() {
        return smpRate;
    }

    public void setSmpRate(DataAttribute<Integer> smpRate) {
        this.smpRate = smpRate;
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

    public DataAttribute<?> getInstMag() {
        return instMag;
    }

    public void setInstMag(DataAttribute<?> instMag) {
        this.instMag = instMag;
    }

    public DataAttribute<?> getMag() {
        return mag;
    }

    public void setMag(DataAttribute<?> mag) {
        this.mag = mag;
    }
}
