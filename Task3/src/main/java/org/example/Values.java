package org.example;

public class Values {
    public int id;
    public String value;

    public Values(){}

    public Values(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Values{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
