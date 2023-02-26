package org.campus02.arrays;

import java.sql.Array;

public class ArrayHelper {

    public static void arrangeOrder(int[] numbers) {
        int[] unsortedArray = numbers;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }


    }

}
