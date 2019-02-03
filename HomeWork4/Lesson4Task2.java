package Lesson4;

import java.util.Arrays;

public class Lesson4Task2 {

    public static void main(String[] args) {

        int[] array = {4, 4, 4, 4, 4, 4, 5, 1, 0, 4};
        int size = array.length;
        boolean[] testArray = new boolean[size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (!testArray[i]) {
                int value = array[i];

                for (int j = i + 1; j < size; j++) {
                    if (value == array[j]) {
                        testArray[j] = true;
                        counter++;
                    }
                }
            }
        }
        int[] ARRAY = new int[size - counter];

        for (int i = 0, j = 0; i < size; i++) {
            if (!testArray[i]) {
                ARRAY[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(ARRAY));
    }
}






