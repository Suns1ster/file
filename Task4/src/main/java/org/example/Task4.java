package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        try {
            List<Integer> nums = new ArrayList<>();
            try (Scanner scanner = new Scanner(System.in)) {
                while (scanner.hasNextInt()) {
                    nums.add(scanner.nextInt());
                }
            }
            Collections.sort(nums);
            if (nums.size()%2 == 0) {
                int med1 = nums.get(nums.size() / 2 - 1);
                int med2 = nums.get(nums.size() / 2);
                int count1 = 0, count2 = 0;
                for (int num : nums) {
                    count1 += Math.abs(num - med1);
                    count2 += Math.abs(num - med2);
                }
                System.out.println(Math.min(count1, count2));
            }
            else{
                int med=nums.get(nums.size()/2);
                int count = 0;
                for (int num : nums) {
                    count+= Math.abs(num - med);
                }
                System.out.println(count);
            }
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
