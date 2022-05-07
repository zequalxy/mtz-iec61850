package practice;

import iec61850.logicalNodes.common.LN;
import iec61850.logicalNodes.control.CSWI;
import iec61850.logicalNodes.control.XCBR;
import iec61850.logicalNodes.gui.NHMI;
import iec61850.logicalNodes.gui.other.NHMISignal;
import iec61850.logicalNodes.measurements.MMXU;
import iec61850.logicalNodes.measurements.SVCB;
import iec61850.logicalNodes.protection.PTOC;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<LN> logicalNodes = new ArrayList<>(); // Лист с логическими узлами

    public static void main(String[] args) {
        SVCB svcb1 = new SVCB();
        logicalNodes.add(svcb1);
        svcb1.readComtrade("src/main/resources/Опыты/Начало линии/PhA80.cfg");

        MMXU mmxu1 = new MMXU();
        logicalNodes.add(mmxu1);
        mmxu1.setInstA(svcb1.getSignals().get(0));
        mmxu1.setInstB(svcb1.getSignals().get(1));
        mmxu1.setInstC(svcb1.getSignals().get(2));

        PTOC ptoc1 = new PTOC();
        logicalNodes.add(ptoc1);
        ptoc1.setA(mmxu1.getA());
        ptoc1.getOpDITmms().getSetVal().setValue(700);
        ptoc1.getStrVal().getSetMag().setValue(0.402);

        CSWI cswi1 = new CSWI();
        logicalNodes.add(cswi1);
        cswi1.setOpOpn(ptoc1.getOp());

        XCBR xcbr1 = new XCBR();
        logicalNodes.add(xcbr1);
        xcbr1.setPos(cswi1.getPos());

        NHMI nhmi1 = new NHMI();
        logicalNodes.add(nhmi1);
        nhmi1.addSignals(new NHMISignal("Ia", svcb1.getSignals().get(0).getInstMag()));
        nhmi1.addSignals(new NHMISignal("Ib", svcb1.getSignals().get(1).getInstMag()));
        nhmi1.addSignals(new NHMISignal("Ic", svcb1.getSignals().get(2).getInstMag()));
        nhmi1.addSignals("Фаза А", new NHMISignal("IaFourier", mmxu1.getA().getPhsA().getcVal().getMag()),
                new NHMISignal("StrVal", ptoc1.getStrVal().getSetMag()));
        nhmi1.addSignals("Фаза B", new NHMISignal("IbFourier", mmxu1.getA().getPhsB().getcVal().getMag()),
                new NHMISignal("StrVal", ptoc1.getStrVal().getSetMag()));
        nhmi1.addSignals("Фаза C", new NHMISignal("IcFourier", mmxu1.getA().getPhsC().getcVal().getMag()),
                new NHMISignal("StrVal", ptoc1.getStrVal().getSetMag()));
        nhmi1.addSignals(new NHMISignal("PtocStr", ptoc1.getStr().getGeneral()));
        nhmi1.addSignals(new NHMISignal("PtocOp", ptoc1.getOp().getGeneral()));
        nhmi1.addSignals(new NHMISignal("breaker", xcbr1.getPos().getCtlVal()));

        while (svcb1.hasNext()) logicalNodes.forEach(LN::process);

    }
}
