package iec61850.dataTypes.statusControl.trip;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

/** Сведения об активации направленной защиты */

public class ACD extends DATA {
    private DataAttribute<Boolean> general = new DataAttribute<>(false); // Общие
    private Enum<Dir> dirGeneral = Dir.UNKNOWN; // Общее направление
    private DataAttribute<Boolean> phsA = new DataAttribute<>(false); // Фаза А
    private Enum<Dir> dirPhsA = Dir.UNKNOWN; // Направление в фазе А
    private DataAttribute<Boolean> phsB = new DataAttribute<>(false); // Фаза В
    private Enum<Dir> dirPhsB = Dir.UNKNOWN; // Направление в фазе В
    private DataAttribute<Boolean> phsC = new DataAttribute<>(false); // Фаза С
    private Enum<Dir> dirPhsC = Dir.UNKNOWN; // Направление в фазе С
    private DataAttribute<Boolean> neut = new DataAttribute<>(false); // Нейтраль
    private Enum<Dir> dirNeut = Dir.UNKNOWN; // Направление в нейтрали


    public enum Dir {
        UNKNOWN, FORWARD, BACKWARD, BOTH;
    }


    public DataAttribute<Boolean> getGeneral() {
        return general;
    }

    public void setGeneral(DataAttribute<Boolean> general) {
        this.general = general;
    }

    public Enum<Dir> getDirGeneral() {
        return dirGeneral;
    }

    public void setDirGeneral(Enum<Dir> dirGeneral) {
        this.dirGeneral = dirGeneral;
    }

    public Enum<Dir> getDirPhsA() {
        return dirPhsA;
    }

    public void setDirPhsA(Enum<Dir> dirPhsA) {
        this.dirPhsA = dirPhsA;
    }

    public Enum<Dir> getDirPhsB() {
        return dirPhsB;
    }

    public void setDirPhsB(Enum<Dir> dirPhsB) {
        this.dirPhsB = dirPhsB;
    }

    public Enum<Dir> getDirPhsC() {
        return dirPhsC;
    }

    public void setDirPhsC(Enum<Dir> dirPhsC) {
        this.dirPhsC = dirPhsC;
    }

    public Enum<Dir> getDirNeut() {
        return dirNeut;
    }

    public void setDirNeut(Enum<Dir> dirNeut) {
        this.dirNeut = dirNeut;
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
