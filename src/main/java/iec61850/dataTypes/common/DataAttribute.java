package iec61850.dataTypes.common;

public class DataAttribute<T> extends DATA {

    protected T value;

    public DataAttribute(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
