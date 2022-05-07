package iec61850.dataTypes.measure.vector;

import iec61850.dataTypes.common.DATA;

/** Класс представляет собой набо одновременно измеренных значений междуфазных напряжений
 * в трехфазной сети */

public class DEL extends DATA {

    /** Значение фаз АB [MX] */
    private CMV phsAB = new CMV();

    /** Значение фаз BC [MX] */
    private CMV phsBC = new CMV();

    /** Значение фаз CA [MX] */
    private CMV phsCA = new CMV();

    public CMV getPhsAB() {
        return phsAB;
    }

    public void setPhsAB(CMV phsAB) {
        this.phsAB = phsAB;
    }

    public CMV getPhsBC() {
        return phsBC;
    }

    public void setPhsBC(CMV phsBC) {
        this.phsBC = phsBC;
    }

    public CMV getPhsCA() {
        return phsCA;
    }

    public void setPhsCA(CMV phsCA) {
        this.phsCA = phsCA;
    }
}
