package kory.karl.reflection.task01;

import java.lang.reflect.*;

public class ReflectionMethods {

    //return instance of java.lang.Math class
    public Math invokingPrivateConstructor() {
        Math math = null;
        return math;
    }

    //invoke Utils class method "methodToInvoke" and return its result
    public int invokingPrivateMethod(Utils util) {
        int result = -1;
        return result;
    }

    //get value of private field "fieldToGet"
    public int gettingPrivateField(Utils util) {
        int result = -1;
        return result;
    }
}