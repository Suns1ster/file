package org.example;

public class Task1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int step = 1;
        do {
            System.out.print(step);
            step += m - 1;
            if (step > n){
                step = step%n;
            }
        }
        while (step != 1);
    }
}
