package iec61850.dataTypes.common;

public class DATA {

    /** Имя экземпляра (phA, phB ...) */
    protected String name;

    /** Полный адрес объекта */
    protected String reference;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
