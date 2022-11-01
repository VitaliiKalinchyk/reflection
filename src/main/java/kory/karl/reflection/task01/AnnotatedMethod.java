package kory.karl.reflection.task01;

import kory.karl.reflection.task01.annotations.*;
import java.lang.reflect.*;
import java.util.*;

public class AnnotatedMethod {

    //Implement method sum to calculate sum of all int args
    //Annotate it twice with @Anno annotation

    public int sum(int ... args){
        int result = -1;
        return result;
    }

    //Implement method calculateFactorial to call Utils2.factorial() method
    //use as argument value from @DefAnno annotation
    public int calculateFactorial() {
        int result = -1;
        return result;
    }
}