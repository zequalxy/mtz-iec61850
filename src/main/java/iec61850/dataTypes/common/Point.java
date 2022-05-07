package iec61850.dataTypes.common;

public class Point {

    /** Значение координаты х точки кривой */
    private DataAttribute<Float> xVal;

    /** Значение координаты y точки кривой */
    private DataAttribute<Float> yVal;

    public DataAttribute<Float> getxVal() {
        return xVal;
    }

    public void setxVal(DataAttribute<Float> xVal) {
        this.xVal = xVal;
    }

    public DataAttribute<Float> getyVal() {
        return yVal;
    }

    public void setyVal(DataAttribute<Float> yVal) {
        this.yVal = yVal;
    }
}
