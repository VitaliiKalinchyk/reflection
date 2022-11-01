package kory.karl.reflection.task01;

import java.lang.reflect.*;

public class ReflectionMethods {

    //return instance of java.lang.Math class
    public Math invokingPrivateConstructor() {
        Math math = null;
//        Class<Math> mathInstance = Math.class;
//        Constructor<Math> privateConstructor;
//        try {
//            privateConstructor = mathInstance.getDeclaredConstructor();
//            if (privateConstructor.trySetAccessible()) {
//                math = privateConstructor.newInstance();
//            }
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
        return math;
    }

    //invoke Utils class method "methodToInvoke" and return its result
    public int invokingPrivateMethod(Utils util) {
        int result = -1;
//        Class<? extends Utils> utilClass = util.getClass();
//        try {
//            Method methodToInvoke = utilClass.getDeclaredMethod("methodToInvoke");
//            if (methodToInvoke.trySetAccessible()) {
//                result = (int) methodToInvoke.invoke(util);
//            }
//        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        return result;
    }

    //get value of private field "fieldToGet"
    public int gettingPrivateField(Utils util) {
        int result = -1;
//        Class<? extends Utils> utilClass = util.getClass();
//        try {
//            Field fieldToGet = utilClass.getDeclaredField("fieldToGet");
//            if (fieldToGet.trySetAccessible()) {
//                result = fieldToGet.getInt(util);
//            }
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
        return result;
    }
}