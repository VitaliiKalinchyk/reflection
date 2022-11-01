package kory.karl.reflection.task01;

import kory.karl.reflection.task01.annotations.*;

import java.util.stream.IntStream;

//Do not change!
public class Utils2 {

    private static final int field = 5;

    @DefAnno(field)
    public static int factorial(int x) {
        return IntStream.rangeClosed(1, x).reduce((x1, x2) -> x1 * x2).orElse(1);
    }
}