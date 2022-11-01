package kory.karl.reflection.task01;

import kory.karl.reflection.task01.annotations.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.*;
import static org.junit.jupiter.api.Assertions.*;

class AnnotatedMethodTest {

    @Test
    void testSum() {
        assertEquals(0, new AnnotatedMethod().sum());
        assertEquals(3, new AnnotatedMethod().sum(1,2));
        assertEquals(10, new AnnotatedMethod().sum(1,2,7));
    }

    @Test
    void testSumAnnotations() throws NoSuchMethodException {
        Method sum = AnnotatedMethod.class.getDeclaredMethod("sum", int[].class);
        Anno[] declaredAnnotationsByType = sum.getDeclaredAnnotationsByType(Anno.class);
        assertEquals(2, declaredAnnotationsByType.length);
    }

    @Test
    void testCalculateFactorial() {
        assertEquals(120, new AnnotatedMethod().calculateFactorial());
    }


}