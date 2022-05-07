package iec61850.logicalNodes.control;

import iec61850.dataTypes.statusControl.BCR;
import iec61850.dataTypes.statusControl.control.DPC;
import iec61850.dataTypes.statusControl.control.SPC;
import iec61850.dataTypes.statusControl.status.INS;
import iec61850.logicalNodes.common.LN;

/** Логический узел используется для моделирования выключателя */

public class XCBR extends LN {

    private DPC Pos = new DPC(); // Положение переключателя
    private SPC BlkOpn = new SPC(); // Блокировка отключения
    private SPC BlkCls = new SPC(); // Блокировка включения
    private SPC ChaMotEna = new SPC(); // Двигатель зарядного устройства включен
    private BCR SumSwARs = new BCR(); // Общее количество переключаемых амперов, со сбросом
    private INS CBOpCap = new INS(); // Функциональные возможности выключателя
    private INS POWCap = new INS(); // Возможности переключения по совпадению фазы
    private INS MaxOpCap = new INS(); // Функциональные характеристики выключателя при полной нагрузке

    @Override
    public void process() {

    }

    public DPC getPos() {
        return Pos;
    }

    public void setPos(DPC pos) {
        Pos = pos;
    }

    public SPC getBlkOpn() {
        return BlkOpn;
    }

    public void setBlkOpn(SPC blkOpn) {
        BlkOpn = blkOpn;
    }

    public SPC getBlkCls() {
        return BlkCls;
    }

    public void setBlkCls(SPC blkCls) {
        BlkCls = blkCls;
    }

    public SPC getChaMotEna() {
        return ChaMotEna;
    }

    public void setChaMotEna(SPC chaMotEna) {
        ChaMotEna = chaMotEna;
    }

    public BCR getSumSwARs() {
        return SumSwARs;
    }

    public void setSumSwARs(BCR sumSwARs) {
        SumSwARs = sumSwARs;
    }

    public INS getCBOpCap() {
        return CBOpCap;
    }

    public void setCBOpCap(INS CBOpCap) {
        this.CBOpCap = CBOpCap;
    }

    public INS getPOWCap() {
        return POWCap;
    }

    public void setPOWCap(INS POWCap) {
        this.POWCap = POWCap;
    }

    public INS getMaxOpCap() {
        return MaxOpCap;
    }

    public void setMaxOpCap(INS maxOpCap) {
        MaxOpCap = maxOpCap;
    }
}
