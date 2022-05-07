package iec61850.dataTypes.statusControl;

import iec61850.dataTypes.common.DATA;
import iec61850.dataTypes.common.DataAttribute;

public class SEC extends DATA {
    private DataAttribute<Integer> cnt = new DataAttribute<>(0);

    public DataAttribute<Integer> getCnt() {
        return cnt;
    }

    public void setCnt(DataAttribute<Integer> cnt) {
        this.cnt = cnt;
    }
}
