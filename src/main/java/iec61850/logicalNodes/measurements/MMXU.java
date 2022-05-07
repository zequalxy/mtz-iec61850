package iec61850.logicalNodes.measurements;

import iec61850.dataTypes.measure.MV;
import iec61850.dataTypes.measure.SAV;
import iec61850.dataTypes.measure.vector.DEL;
import iec61850.dataTypes.measure.vector.WYE;
import iec61850.logicalNodes.common.Filter;
import iec61850.logicalNodes.common.LN;
import iec61850.logicalNodes.filters.Fourier;

/** Данный логический узел используется для расчета тока */

public class MMXU extends LN {

    private SAV instA; // Ток фазы А
    private SAV instB; // Ток фазы B
    private SAV instC; // Ток фазы С

    private Filter aFilter = new Fourier(80); // Фильтр Фурье для фазы А
    private Filter bFilter = new Fourier(80); // Фильтр Фурье для фазы B
    private Filter cFilter = new Fourier(80); // Фильтр Фурье для фазы C

    private MV TotW; // Суммарная активная мощность

    private MV TotVAr; // Суммарная реактивная мощность

    private MV TotVA; // Суммарная фиксируемая мощность
    private MV TotPF; // Средний коэффициент мощности
    private MV Hz; // Частота
    private DEL PPV; // Линейное напряжение
    private WYE Phv; // Фазное напряжение
    private WYE A = new WYE(); // Фазные токи
    private WYE W; // Активная мощность фазы
    private WYE VAr; // Реактивная мощность фазы
    private WYE VA; // Фиксируемая мощность фазы
    private WYE PF; // Коэффициент мощности фазы
    private WYE Z; // Полное сопротивление фазы

    /** Публичный конструктор. Инициализируем значения фазных токов */

    public MMXU() {

        this.A.getPhsA().getcVal().setMag(this.aFilter.getOutputVal().getMag());
        this.A.getPhsB().getcVal().setMag(this.bFilter.getOutputVal().getMag());
        this.A.getPhsC().getcVal().setMag(this.cFilter.getOutputVal().getMag());

        this.A.getPhsA().getInstCVal().setMag(this.aFilter.getOutputInstVal().getMag());
        this.A.getPhsB().getInstCVal().setMag(this.bFilter.getOutputInstVal().getMag());
        this.A.getPhsC().getInstCVal().setMag(this.cFilter.getOutputInstVal().getMag());

    }

    /** Вызываем метод process() для каждого фильтра */

    @Override
    public void process() {
        this.aFilter.process();
        this.bFilter.process();
        this.cFilter.process();
    }


    public void setTotW(MV totW) {
        TotW = totW;
    }

    public MV getTotVAr() {
        return TotVAr;
    }

    public void setTotVAr(MV totVAr) {
        TotVAr = totVAr;
    }

    public MV getTotVA() {
        return TotVA;
    }

    public void setTotVA(MV totVA) {
        TotVA = totVA;
    }

    public MV getTotPF() {
        return TotPF;
    }

    public void setInstC(SAV instC) {
        this.instC = instC;
        this.cFilter.setInput(this.instC);
    }

    public void setTotPF(MV totPF) {
        TotPF = totPF;
    }

    public MV getHz() {
        return Hz;
    }

    public void setHz(MV hz) {
        Hz = hz;
    }

    public SAV getInstA() {
        return instA;
    }

    public void setInstA(SAV instA) {
        this.instA = instA;
        this.aFilter.setInput(this.instA);
    }

    public SAV getInstB() {
        return instB;
    }

    public void setInstB(SAV instB) {
        this.instB = instB;
        this.bFilter.setInput(this.instB);
    }

    public SAV getInstC() {
        return instC;
    }

    public DEL getPPV() {
        return PPV;
    }

    public void setPPV(DEL PPV) {
        this.PPV = PPV;
    }

    public WYE getPhv() {
        return Phv;
    }

    public void setPhv(WYE phv) {
        Phv = phv;
    }

    public WYE getA() {
        return A;
    }

    public void setA(WYE a) {
        A = a;
    }

    public WYE getW() {
        return W;
    }

    public void setW(WYE w) {
        W = w;
    }

    public WYE getVAr() {
        return VAr;
    }

    public void setVAr(WYE VAr) {
        this.VAr = VAr;
    }

    public WYE getVA() {
        return VA;
    }

    public void setVA(WYE VA) {
        this.VA = VA;
    }

    public WYE getPF() {
        return PF;
    }

    public void setPF(WYE PF) {
        this.PF = PF;
    }

    public WYE getZ() {
        return Z;
    }

    public void setZ(WYE z) {
        Z = z;
    }
}
