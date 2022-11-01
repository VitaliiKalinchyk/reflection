package kory.karl.reflection.task01;

import kory.karl.reflection.task01.annotations.*;
import java.lang.reflect.*;
import java.util.*;

public class AnnotatedMethod {

    //Implement method sum to calculate sum of all int args
    //Annotate it twice with @Anno annotation
    @Anno(5)
    @Anno(6)
    public int sum(int ... args){
        int result = -1;
        result = Arrays.stream(args).sum();
        return result;
    }

    //Implement method calculateFactorial to call Utils2.factorial() method
    //use as argument value from @DefAnno annotation
    public int calculateFactorial() {
        int result = -1;
        Method factorial;
        try {
            factorial = Utils2.class.getDeclaredMethod("factorial", int.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        DefAnno annotation = factorial.getAnnotation(DefAnno.class);
        result = Utils2.factorial(annotation.value());
        return result;
    }
}