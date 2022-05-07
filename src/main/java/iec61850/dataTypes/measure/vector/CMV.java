package iec61850.dataTypes.measure.vector;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;
import iec61850.dataTypes.common.Vector;

/** Комплексные измеряемые знаения */

public class CMV  extends DATA {
    private Vector<Double> instCVal = new Vector<>();
    private Vector<Double> cVal = new Vector<>();
    private Enum<Range> range = Range.NORMAL;
    private DataAttribute<Boolean> subEna;
    private Vector<?> subCVal = new Vector<>();
    private String subID;
    private DataAttribute<Integer> db;
    private DataAttribute<Integer> zeroDb;
    private DataAttribute<Integer> smpRate;
    private String d;
    private String dU;
    private String cdcNs;
    private String cdcName;
    private String dataNs;


    public enum Range {
        NORMAL, HIGH, LOW, HIGH_HIGH, LOW_LOW;
    }

    public Enum<Range> getRange() {
        return range;
    }

    public void setRange(Enum<Range> range) {
        this.range = range;
    }

    public DataAttribute<Boolean> getSubEna() {
        return subEna;
    }

    public void setSubEna(DataAttribute<Boolean> subEna) {
        this.subEna = subEna;
    }

    public Vector<?> getSubCVal() {
        return subCVal;
    }

    public void setSubCVal(Vector<?> subCVal) {
        this.subCVal = subCVal;
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

    public Vector<Double> getInstCVal() {
        return instCVal;
    }

    public void setInstCVal(Vector<Double> instCVal) {
        this.instCVal = instCVal;
    }

    public Vector<Double> getcVal() {
        return cVal;
    }

    public void setcVal(Vector<Double> cVal) {
        this.cVal = cVal;
    }
}
