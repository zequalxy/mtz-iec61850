package iec61850.dataTypes.measure;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Класс используется для представления выборок мгновенных значений
 * аналогового сигнала */

public class SAV extends DATA {

    private final DataAttribute<Float> instMag = new DataAttribute<>((float) 0); // Мгновенное значение
    private DataAttribute<Float> min;
    private DataAttribute<Float> max;
    private String d;
    private String dU;
    private String cdcName;
    private String cdcNs;
    private String dataNs;

    public DataAttribute<Float> getMin() {
        return min;
    }

    public void setMin(DataAttribute<Float> min) {
        this.min = min;
    }

    public DataAttribute<Float> getMax() {
        return max;
    }

    public void setMax(DataAttribute<Float> max) {
        this.max = max;
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

    public String getCdcName() {
        return cdcName;
    }

    public void setCdcName(String cdcName) {
        this.cdcName = cdcName;
    }

    public String getCdcNs() {
        return cdcNs;
    }

    public void setCdcNs(String cdcNs) {
        this.cdcNs = cdcNs;
    }

    public String getDataNs() {
        return dataNs;
    }

    public void setDataNs(String dataNs) {
        this.dataNs = dataNs;
    }

    public DataAttribute<Float> getInstMag() {
        return instMag;
    }
}
