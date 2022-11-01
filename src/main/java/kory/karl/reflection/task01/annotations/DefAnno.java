package kory.karl.reflection.task01.annotations;

import java.lang.annotation.*;

//Do not change
@Retention(RetentionPolicy.RUNTIME)
public @interface DefAnno {
    int value() default 0;
}