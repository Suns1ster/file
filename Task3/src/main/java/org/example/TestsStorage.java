package org.example;

import java.util.Arrays;

public class TestsStorage {
    public Tests[] tests;

    public TestsStorage() {
    }

    public TestsStorage(Tests[] tests) {
        this.tests = tests;
    }

    public Tests[] getTests() {
        return tests;
    }

    public void setTests(Tests[] tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "TestsStorage{" +
                "tests=" + Arrays.toString(tests) +
                '}';
    }
}
