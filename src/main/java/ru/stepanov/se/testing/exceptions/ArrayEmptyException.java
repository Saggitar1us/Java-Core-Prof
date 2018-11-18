package ru.stepanov.se.testing.exceptions;

import java.util.concurrent.Executors;

/**
 * @author Aleksei Stepanov
 */


public class ArrayEmptyException extends Exception {

    public ArrayEmptyException(final String msg) {
        System.out.println(msg);
    }

}
