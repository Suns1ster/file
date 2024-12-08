package org.example;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>();
        String file = args[0];
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                nums.add(Integer.parseInt(line));
                line = br.readLine();
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
        catch (IOException e){
            System.out.println("error");
        }
    }
}
