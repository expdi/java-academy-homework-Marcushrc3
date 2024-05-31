package com.marcus;// Lesson 3

public class CountDivisibleByThreeOrSeven {
    public static void main(String[] args) {
        int count = 0;

        for (int i = -500; i <= 500; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                count++;
            }
        }

        System.out.println("Count of numbers divisible by 3 or 7: " + count);
    }
}
