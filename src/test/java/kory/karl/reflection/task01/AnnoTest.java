package kory.karl.reflection.task01;

import kory.karl.reflection.task01.annotations.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.*;

public class AnnoTest {

    @Test
    void testIfRepeatable() {
        assertNotNull(Anno.class.getAnnotation(Repeatable.class));
    }

    @Test
    void testIfForMethodsOnly() {
        ElementType[] value = Anno.class.getAnnotation(Target.class).value();
        assertEquals(1, value.length);
        assertEquals(ElementType.METHOD, value[0]);
    }
}