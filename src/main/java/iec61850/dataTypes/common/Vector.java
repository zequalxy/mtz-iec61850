package iec61850.dataTypes.common;

public class Vector<T> {

    private DataAttribute<T> mag; // Модуль комплексного числа

    private DataAttribute<T> ang; // Угол комплексного числа в градусах

    public DataAttribute<T> getMag() {
        return mag;
    }

    public void setMag(DataAttribute<T> mag) {
        this.mag = mag;
    }

    public DataAttribute<T> getAng() {
        return ang;
    }

    public void setAng(DataAttribute<T> ang) {
        this.ang = ang;
    }
}
