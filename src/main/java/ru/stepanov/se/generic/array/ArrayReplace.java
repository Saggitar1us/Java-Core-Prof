package ru.stepanov.se.generic.array;

import java.util.Random;

public class ArrayReplace<T extends Object> {

    private T[] array;
    private int first;
    private int second;

    public ArrayReplace(final T[] array) {
        this.array = array;
    }

    public void replaceArray() {
        T temp;
        Random random = new Random();
        first = random.nextInt(array.length);
        second = random.nextInt(array.length);
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();
    }
}
