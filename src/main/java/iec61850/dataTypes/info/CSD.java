package iec61850.dataTypes.info;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;
import iec61850.dataTypes.common.Point;

import java.util.ArrayList;
import java.util.List;

/** Данные класса используют для считывания формы кривой */

public class CSD  extends DATA {
    private DataAttribute<Integer> numPts = new DataAttribute<>(0);
    private List<Point> crvPts = new ArrayList<>();

    public DataAttribute<Integer> getNumPts() {
        return numPts;
    }

    public void setNumPts(DataAttribute<Integer> numPts) {
        this.numPts = numPts;
    }

    public List<Point> getCrvPts() {
        return crvPts;
    }

    public void setCrvPts(List<Point> crvPts) {
        this.crvPts = crvPts;
    }
}
