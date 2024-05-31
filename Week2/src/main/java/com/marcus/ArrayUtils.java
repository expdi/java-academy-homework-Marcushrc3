package com.marcus;

import java.util.Random;

public class ArrayUtils {
    public static int[] createArray(int size, int limit) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(limit);
        }
        return array;
    }
}

