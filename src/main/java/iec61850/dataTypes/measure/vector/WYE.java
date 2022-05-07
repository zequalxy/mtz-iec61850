package iec61850.dataTypes.measure.vector;

import iec61850.dataTypes.common.DATA;

/** Класс представляет собой набор одновременно измеренных значений
 * в трехфазной сети, представляющих значения напряжения фаз
 * относительно земли*/

public class WYE extends DATA {

    /** Значение фазы А [MX] */
    private CMV phsA = new CMV();

    /** Значение фазы B [MX] */
    private CMV phsB = new CMV();

    /** Значение фазы C [MX] */
    private CMV phsC = new CMV();

    /** Значение нейтрали [MX] */
    private CMV neut = new CMV();

    private CMV net = new CMV();
    private CMV res = new CMV();

    public CMV getPhsA() {
        return phsA;
    }

    public void setPhsA(CMV phsA) {
        this.phsA = phsA;
    }

    public CMV getPhsB() {
        return phsB;
    }

    public void setPhsB(CMV phsB) {
        this.phsB = phsB;
    }

    public CMV getPhsC() {
        return phsC;
    }

    public void setPhsC(CMV phsC) {
        this.phsC = phsC;
    }

    public CMV getNeut() {
        return neut;
    }

    public void setNeut(CMV neut) {
        this.neut = neut;
    }

    public CMV getNet() {
        return net;
    }

    public void setNet(CMV net) {
        this.net = net;
    }

    public CMV getRes() {
        return res;
    }

    public void setRes(CMV res) {
        this.res = res;
    }
}
