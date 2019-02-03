package Lesson4;

import java.util.Arrays;

public class Lesson4Task1 {

    public static void main(String[] args) {
        int[] array = {67, 78, 98, 56, 478, 90, 98};
        moveRight(array, 1);
        System.out.println(Arrays.toString(array));
    }

    public static void moveRight(int[] array, int value) {
        int size = array.length;
        for (int i = 0; i < value; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}