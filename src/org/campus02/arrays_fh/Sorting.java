package org.campus02.arrays_fh;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {6, 8, 7, 9, 5, 4, 3, 2};

        Car[] cars = {
                new Car(2022, "silver", 2500),
                new Car(2000, "blue", 1300),
                new Car(1989, "brown", 1200)
        };


        arrangeOrder(cars);

        System.out.println(Arrays.toString(cars));
    }

    public static void arrangeOrder(Sortable[] numbers) {

        // bubblesort oder jede andere einfache sortierung

        // array von vorne nach hinten durchlaufen
        // element (i) mit dem nachbar (i+1) vergleichen
        // wenn element (i) > nachbar (i+1) dann austauschen
        // wenn Ende erreicht, wieder von vorne beginnen
        // solange alles wiederholen, bis in einem durchlauf keine verschiebung war

        for (int j = 0; j < numbers.length; j++) {
            boolean changes = false;
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                if (numbers[i].compareTo(numbers[i + 1]) > 0) {
                    Sortable temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    changes = true;
                }
            }
            if (changes == false)
                break;
        }

    }
}
