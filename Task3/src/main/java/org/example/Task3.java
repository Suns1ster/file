package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3 {
    public static void fillingValues(Tests[] tests, Map<Integer, String> values){
        for (Tests test: tests){
            test.setValue(values.get(test.getId()));
            if(test.getValues()!=null){
                fillingValues(test.getValues(), values);
            }
        }
    }
    public static void main(String[] args) {
        String testsPath = args[0];
        String valuesPath = args[1];
        String reportsPath = args[2];
        try {
            ObjectMapper mapper = new ObjectMapper();
            TestsStorage testsStore = mapper.readValue(new File(testsPath), TestsStorage.class);
            ValuesStorage valuesStore = mapper.readValue(new File(valuesPath), ValuesStorage.class);
            Map<Integer, String> values = Arrays.stream(valuesStore.getValues()).collect(Collectors.toMap(value -> value.id, value -> value.value));
            fillingValues(testsStore.getTests(),values);
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(reportsPath), testsStore);
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
