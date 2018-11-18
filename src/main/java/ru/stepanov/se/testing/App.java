package ru.stepanov.se.testing;

import ru.stepanov.se.testing.exceptions.ArrayEmptyException;

import java.sql.SQLOutput;

/**
 * @author Aleksei Stepanov
 */


public class App {

    public static int[] returnNewArray(final int[] array) throws ArrayEmptyException {

        int lastFour = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 4) continue;
                lastFour = i;
                break;
            }

            final int[] newArray = new int[array.length - (lastFour + 1)];
            System.arraycopy(array, lastFour + 1, newArray, 0, newArray.length);
            return newArray;

        } else throw new ArrayEmptyException("ERROR: array is empty");
    }

    public static boolean checkArray(final int[] array) {
        if (array.length == 0) return false;

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1:
                case 4:
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws ArrayEmptyException {
        int[] array = new int[]{1, 2, 5, 4, 6, 7, 99};
        System.out.print("A new array is: ");
        for (int i : returnNewArray(array)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Is array contains 1 or 4: " + checkArray(array));
    }

}
