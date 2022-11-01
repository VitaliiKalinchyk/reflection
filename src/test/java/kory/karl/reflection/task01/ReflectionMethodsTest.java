package kory.karl.reflection.task01;

import org.junit.jupiter.api.*;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;


class ReflectionMethodsTest {

    ReflectionMethods object = new ReflectionMethods();

    @Test
    void testInvokingPrivateConstructor() {
        assertInstanceOf(Math.class, object.invokingPrivateConstructor());
    }

    @Test
    void testInvokingPrivateMethod() {
        int value = new Random().nextInt(1000);
        Utils utils = new Utils(value);
        int result = (int) Math.pow(value, 2);
        assertEquals(result, object.invokingPrivateMethod(utils));
    }

    @Test
    void testGettingPrivateField() {
        int result = new Random().nextInt(1000);
        Utils utils = new Utils(result);
        assertEquals(result, object.gettingPrivateField(utils));
    }
}