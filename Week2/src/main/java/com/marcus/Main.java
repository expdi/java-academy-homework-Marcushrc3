package com.marcus;

public class Main {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(10, 50);
        for (int value : array) {
            System.out.println(value);
        }
    }
}
