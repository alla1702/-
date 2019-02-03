package Lesson4;

import java.util.Arrays;

public class Lesson4Task3 {

    public static void main(String[] args) {

        int[] array1 = {2, 4, 5, 6, 6, 7, 9};
        int[] array2 = {1, 2, 3, 4, 5, 45, 56, 56, 23};
        int SizeArray1 = array1.length;
        int SizeArray2 = array2.length;
        int[] ARRAY = new int[SizeArray1 + SizeArray2];

        if (SizeArray1 == SizeArray2) {
            for (int i = 0; i < SizeArray1; i++) {
                ARRAY[i + i] = array1[i];
                ARRAY[i + i + 1] = array2[i];
            }
            System.out.print(Arrays.toString(ARRAY));
        }

        if (SizeArray1 > SizeArray2) {
            for (int i = 0; i < SizeArray2; i++) {
                ARRAY[i + i] = array1[i];
                ARRAY[i + i + 1] = array2[i];
            }
            for (int i = SizeArray2; i < SizeArray1; i++) {
                ARRAY[i + SizeArray2] = array1[i];
            }
            System.out.print(Arrays.toString(ARRAY));
        }

        if (SizeArray1 < SizeArray2) {
            for (int i = 0; i < SizeArray1; i++) {
                ARRAY[i + i] = array1[i];
                ARRAY[i + i + 1] = array2[i];
            }
            for (int i = SizeArray1; i < SizeArray2; i++) {
                ARRAY[i + SizeArray1] = array2[i];
            }
            System.out.print(Arrays.toString(ARRAY));
        }
    }
}
