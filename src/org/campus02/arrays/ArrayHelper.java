package org.campus02.arrays;

import java.sql.Array;

public class ArrayHelper {

    public static void arrangeOrder(int[] numbers) {
        int[] unsortedArray = numbers;

        for (int i = 0; i < numbers.length; i++) {
            boolean changes = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    changes = true;
                }
            }
            if (changes == false){
                break;
            }

        }


    }

}
