package iec61850.logicalNodes.protection;

import iec61850.dataTypes.info.CSD;
import iec61850.dataTypes.measure.vector.WYE;
import iec61850.dataTypes.settings.ASG;
import iec61850.dataTypes.settings.ING;
import iec61850.dataTypes.statusControl.trip.ACD;
import iec61850.dataTypes.statusControl.trip.ACT;
import iec61850.logicalNodes.common.LN;

/** Логический узел моделирует максимальную токовую защиту */

public class PTOC extends LN {

    private WYE A; // Данные с узла MMXU
    private int counter = 0; // Счетчик для моделирования выдержки времени

    private ACD Str = new ACD(); // Пуск
    private ACT Op = new ACT(); // Срабатывание
    private CSD TmASt = new CSD(); // Динамические характеристики графика
    private ASG StrVal = new ASG(); // Начальное значение
    private ASG TmMult = new ASG(); // Умножитель уставок времени
    private ING MinOpTmms = new ING(); // Минимальное время срабатывания
    private ING MaxOpTmms = new ING(); // Максимальное время срабатывания
    private ING OpDITmms = new ING(); // Время задержки срабатывания
    private ING TypRsCrv = new ING(); // Тип графика сброса
    private ING RsDITmms = new ING(); // Время задержки сброса
    private ING DirMod = new ING(); // Режим направленной защиты

    /** Если значение тока по одной из фаз превысило значение уставки, то начинаем отсчет выдержки времени,
     * отправляем сигнал пуска, если еще не отправили, и сигнал срабатывания, если накопили выдержку времени */

    @Override
    public void process() {
        if ((A.getPhsA().getcVal().getMag().getValue() > this.StrVal.getSetMag().getValue())
                || (A.getPhsB().getcVal().getMag().getValue() > this.StrVal.getSetMag().getValue())
                || (A.getPhsC().getcVal().getMag().getValue() > this.StrVal.getSetMag().getValue())) {
            counter++;
            if (!Str.getGeneral().getValue()) {
                Str.getGeneral().setValue(true);
            }
            if (counter == OpDITmms.getSetVal().getValue()) {
                Op.getGeneral().setValue(true);
            }
        }
    }

    public WYE getA() {
        return A;
    }

    public void setA(WYE a) {
        A = a;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public ACD getStr() {
        return Str;
    }

    public void setStr(ACD str) {
        Str = str;
    }

    public ACT getOp() {
        return Op;
    }

    public void setOp(ACT op) {
        Op = op;
    }

    public CSD getTmASt() {
        return TmASt;
    }

    public void setTmASt(CSD tmASt) {
        TmASt = tmASt;
    }

    public ASG getStrVal() {
        return StrVal;
    }

    public void setStrVal(ASG strVal) {
        StrVal = strVal;
    }

    public ASG getTmMult() {
        return TmMult;
    }

    public void setTmMult(ASG tmMult) {
        TmMult = tmMult;
    }

    public ING getMinOpTmms() {
        return MinOpTmms;
    }

    public void setMinOpTmms(ING minOpTmms) {
        MinOpTmms = minOpTmms;
    }

    public ING getMaxOpTmms() {
        return MaxOpTmms;
    }

    public void setMaxOpTmms(ING maxOpTmms) {
        MaxOpTmms = maxOpTmms;
    }

    public ING getOpDITmms() {
        return OpDITmms;
    }

    public void setOpDITmms(ING opDITmms) {
        OpDITmms = opDITmms;
    }

    public ING getTypRsCrv() {
        return TypRsCrv;
    }

    public void setTypRsCrv(ING typRsCrv) {
        TypRsCrv = typRsCrv;
    }

    public ING getRsDITmms() {
        return RsDITmms;
    }

    public void setRsDITmms(ING rsDITmms) {
        RsDITmms = rsDITmms;
    }

    public ING getDirMod() {
        return DirMod;
    }

    public void setDirMod(ING dirMod) {
        DirMod = dirMod;
    }
}
