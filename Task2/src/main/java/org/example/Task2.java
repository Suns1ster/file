package org.example;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String file1 = args[0];
        String file2 = args[1];
        double[] centerCords = new double[2];
        double r = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))){
            String line = bufferedReader.readLine();
            centerCords = Arrays.stream(line.trim().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            line =  bufferedReader.readLine();
            r = Double.parseDouble(line);
        }
        catch (IOException e){
            System.out.println("error");
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))){
            String pointCords = bufferedReader.readLine();
            while (pointCords !=null){
                double[] point = Arrays.stream(pointCords.trim().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
                double distanceSq = (point[0] - centerCords[0])*(point[0] - centerCords[0])+(point[1] - centerCords[1])*(point[1] - centerCords[1]);
                double epsilon = 1e-14;
                if (Math.abs(distanceSq - r*r) <= epsilon){
                    System.out.println("0");
                }
                else {
                    if (distanceSq - r*r < 0){
                        System.out.println("1");
                    }
                    else {
                        System.out.println("2");
                    }
                }
                pointCords = bufferedReader.readLine();
            }
        }
        catch (IOException e){
            System.out.println("error");
        }
    }
}