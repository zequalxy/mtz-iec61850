package iec61850.dataTypes.statusControl.status;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class DPS extends DATA {
    private DataAttribute<Boolean> subEna = new DataAttribute<>(true);

    public DataAttribute<Boolean> getSubEna() {
        return subEna;
    }

    public void setSubEna(DataAttribute<Boolean> subEna) {
        this.subEna = subEna;
    }
}
