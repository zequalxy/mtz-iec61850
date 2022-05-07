package iec61850.logicalNodes.control;

import iec61850.dataTypes.statusControl.control.DPC;
import iec61850.dataTypes.statusControl.trip.ACT;
import iec61850.logicalNodes.common.LN;

/** Логический узел используется для управлением состоянием выключателя */

public class CSWI extends LN {

    private DPC Pos = new DPC(); // Выключатель, общий
    private DPC PosA = new DPC(); // Выключатель L1
    private DPC PosB = new DPC(); // выключатель L2
    private DPC PosC = new DPC(); // Выключатель L3
    private ACT OpOpn = new ACT(); // Действие "Отключить выключатель"
    private ACT OpCls = new ACT(); // Действие "Включить выключатель"

    /** Переводит выключатель в состояний ОТКЛ, если пришел сигнал от защиты и в данный момент
     * выключатель в состоянии ВКЛ */

    @Override
    public void process() {
        if(OpOpn.getGeneral().getValue().equals(true) && Pos.getCtlVal().getValue().equals(true)) {
            Pos.getCtlVal().setValue(false);
            Pos.setStVal(DPC.State.OFF);
        }

    }

    public DPC getPos() {
        return Pos;
    }

    public void setPos(DPC pos) {
        Pos = pos;
    }

    public DPC getPosA() {
        return PosA;
    }

    public void setPosA(DPC posA) {
        PosA = posA;
    }

    public DPC getPosB() {
        return PosB;
    }

    public void setPosB(DPC posB) {
        PosB = posB;
    }

    public DPC getPosC() {
        return PosC;
    }

    public void setPosC(DPC posC) {
        PosC = posC;
    }

    public ACT getOpOpn() {
        return OpOpn;
    }

    public void setOpOpn(ACT opOpn) {
        OpOpn = opOpn;
    }

    public ACT getOpCls() {
        return OpCls;
    }

    public void setOpCls(ACT opCls) {
        OpCls = opCls;
    }
}
