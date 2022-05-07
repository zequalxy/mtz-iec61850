package iec61850.logicalNodes.common;

import iec61850.dataTypes.common.Vector;
import iec61850.dataTypes.measure.SAV;

/** Абстрактный класс, от которого будут наследоваться
* различные реализации фильтров */
public abstract class Filter extends LN {
    private SAV input; // Входное значение
    private Vector<Double> outputInstVal = new Vector<>(); // Отфильтрованное значение (мгновенное)
    private Vector<Double> outputVal = new Vector<>(); // Отфильтрованное значение (действующее)

    public SAV getInput() {
        return input;
    }

    public void setInput(SAV input) {
        this.input = input;
    }

    public Vector<Double> getOutputInstVal() {
        return outputInstVal;
    }

    public void setOutputInstVal(Vector<Double> outputInstVal) {
        this.outputInstVal = outputInstVal;
    }

    public Vector<Double> getOutputVal() {
        return outputVal;
    }

    public void setOutputVal(Vector<Double> outputVal) {
        this.outputVal = outputVal;
    }
}

