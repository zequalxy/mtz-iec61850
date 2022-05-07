package iec61850.dataTypes.statusControl.trip;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Сведения об активации защиты */

public class ACT extends DATA {

    private DataAttribute<Boolean> general = new DataAttribute<>(false); // Общее
    private DataAttribute<Boolean> phsA = new DataAttribute<>(false); // Фаза А
    private DataAttribute<Boolean> phsB = new DataAttribute<>(false); // Фаза В
    private DataAttribute<Boolean> phsC = new DataAttribute<>(false); // Фаза С
    private DataAttribute<Boolean> neut = new DataAttribute<>(false); // Нейтраль

    public DataAttribute<Boolean> getGeneral() {
        return general;
    }

    public void setGeneral(DataAttribute<Boolean> general) {
        this.general = general;
    }

    public DataAttribute<Boolean> getPhsA() {
        return phsA;
    }

    public void setPhsA(DataAttribute<Boolean> phsA) {
        this.phsA = phsA;
    }

    public DataAttribute<Boolean> getPhsB() {
        return phsB;
    }

    public void setPhsB(DataAttribute<Boolean> phsB) {
        this.phsB = phsB;
    }

    public DataAttribute<Boolean> getPhsC() {
        return phsC;
    }

    public void setPhsC(DataAttribute<Boolean> phsC) {
        this.phsC = phsC;
    }

    public DataAttribute<Boolean> getNeut() {
        return neut;
    }

    public void setNeut(DataAttribute<Boolean> neut) {
        this.neut = neut;
    }
}
