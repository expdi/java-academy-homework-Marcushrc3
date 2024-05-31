package com.marcus;//Lesson 2

public class DivisibleByThreeOrSeven {
    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 or 7:");

        // Using for loop
        for (int i = -500; i <= 500; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }

        // Using while loop
        int number = -500;
        while (number <= 500) {
            if (number % 3 == 0 || number % 7 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
