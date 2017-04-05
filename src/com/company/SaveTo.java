package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by arahis on 4/5/17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
