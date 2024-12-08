package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValuesStorage {
    public static Values[] values;

    public Values[]  getValues() {
        return values;
    }

    public void setValues(Values[] values) {
        this.values = values;
    }

    public ValuesStorage(Values[] values) {
        this.values = values;
    }

    public ValuesStorage() {
    }

    @Override
    public String toString() {
        return "ValuesStorage{" +
                "values=" + values +
                '}';
    }
}