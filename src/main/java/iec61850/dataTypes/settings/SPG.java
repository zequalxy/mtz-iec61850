package iec61850.dataTypes.settings;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class SPG extends DATA {

    DataAttribute<Boolean> setVal = new DataAttribute<>(false);

    public DataAttribute<Boolean> getSetVal() {
        return setVal;
    }

    public void setSetVal(DataAttribute<Boolean> setVal) {
        this.setVal = setVal;
    }
}
