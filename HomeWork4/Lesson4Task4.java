package Lesson4;

import java.util.Arrays;

public class Lesson4Task4 {

    public static void main(String[] args) {

        int TwoDimentionalArray[][] =
                {{1, 2, 3, 4, 5, 6, 7, 8, 4, 5, 6, 3, 4, 5, 6, 7, 8, 9},
                        {56, 65, 74, 8, 67, 67, 89, 34, 5, 7, 6}};

        System.out.println(TwoDimentionalArray[0].length);
        System.out.println(TwoDimentionalArray[1].length);
        linearize(TwoDimentionalArray);
    }

    public static int[] linearize(int TwoDimentionalArray[][]) {
        int[] ARRAY = new int[TwoDimentionalArray[0].length + TwoDimentionalArray[1].length];
        if (TwoDimentionalArray[0].length == TwoDimentionalArray[1].length) {
            for (int i = 0; i < TwoDimentionalArray.length; i++) {
                for (int j = 0; j < TwoDimentionalArray[i].length; j++) {
                    ARRAY[i * TwoDimentionalArray[i].length + j] = TwoDimentionalArray[i][j];
                }
            }
        } else if (TwoDimentionalArray[0].length != TwoDimentionalArray[1].length) {
            for (int i = 0; i < TwoDimentionalArray.length; i++) {
                for (int j = 0; j < TwoDimentionalArray[i].length; j++) {
                    ARRAY[i * TwoDimentionalArray[0].length + j] = TwoDimentionalArray[i][j];
                }
            }
            System.out.println(Arrays.toString(ARRAY));
        }
        return ARRAY;
    }
}