package iec61850.logicalNodes.common;

import iec61850.dataTypes.common.DPL;
import iec61850.dataTypes.common.LPL;
import iec61850.dataTypes.statusControl.control.INC;
import iec61850.dataTypes.statusControl.status.INS;
import iec61850.dataTypes.statusControl.status.SPS;

/** Класс, от которого наследуются все логические узлы **/

public abstract class LN {

    private INC Mod = new INC(); // Режим
    private INS Beh = new INS(); // Режим работы
    private INS Health = new INS(); // Состояние работоспособности
    private LPL NamPlt = new LPL(); // Паспортная табличка
    private SPS Loc = new SPS(); // Локальная операция
    private INS EEHealth = new INS(); // Состояние работоспособности внешнего оборудования
    private DPL EEName = new DPL(); // Паспортная табличка внешнего оборудования
    private INC OpCntRs = new INC(); // Счетчик числа переключений со сбросом
    private INS OpCnt = new INS(); // Счетчик числа переключений
    private INS OpTmh = new INS(); // Время работы


    public abstract void process();

    public INC getMod() {
        return Mod;
    }

    public void setMod(INC mod) {
        Mod = mod;
    }

    public INS getBeh() {
        return Beh;
    }

    public void setBeh(INS beh) {
        Beh = beh;
    }

    public INS getHealth() {
        return Health;
    }

    public void setHealth(INS health) {
        Health = health;
    }

    public LPL getNamPlt() {
        return NamPlt;
    }

    public void setNamPlt(LPL namPlt) {
        NamPlt = namPlt;
    }

    public SPS getLoc() {
        return Loc;
    }

    public void setLoc(SPS loc) {
        Loc = loc;
    }

    public INS getEEHealth() {
        return EEHealth;
    }

    public void setEEHealth(INS EEHealth) {
        this.EEHealth = EEHealth;
    }

    public DPL getEEName() {
        return EEName;
    }

    public void setEEName(DPL EEName) {
        this.EEName = EEName;
    }

    public INC getOpCntRs() {
        return OpCntRs;
    }

    public void setOpCntRs(INC opCntRs) {
        OpCntRs = opCntRs;
    }

    public INS getOpCnt() {
        return OpCnt;
    }

    public void setOpCnt(INS opCnt) {
        OpCnt = opCnt;
    }

    public INS getOpTmh() {
        return OpTmh;
    }

    public void setOpTmh(INS opTmh) {
        OpTmh = opTmh;
    }
}
