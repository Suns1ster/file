package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Arrays;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tests {
    public int id;
    public String title;
    public String value;
    public Tests[] values;

    public Tests(int id, String title, String value, Tests[] values) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.values = values;
    }

    public Tests() {
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getValue() {
        return value;
    }

    public Tests[] getValues() {
        return values;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setValues(Tests[] values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Tests{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", values=" + Arrays.toString(values) +
                '}';
    }
}
