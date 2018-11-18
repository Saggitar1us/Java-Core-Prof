package ru.stepanov.se.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.stepanov.se.testing.exceptions.ArrayEmptyException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Aleksei Stepanov
 */


public class AppTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 2, 3, 5, 5, 99),
                Arguments.of(1, 2, 5, 5, 99),
                Arguments.of(0, 4, 5, 99),
                Arguments.of(1, 0, 0),
                Arguments.of(1, 2, 5, 4, 99)
        );
    }

    @ParameterizedTest(name = "Return new array, array: {1}")
    @MethodSource("data")
    void emptyArray(int[] array) throws ArrayEmptyException {
        Assertions.assertNull(App.returnNewArray(array), "Array isn't empty");
    }

    @ParameterizedTest(name = "Return new array, array: {1}")
    @MethodSource("data")
    void checkArray(int[] array) throws ArrayEmptyException {
        Assertions.assertTrue(App.checkArray(array), "Array not equals 1 or 4");
    }
}
