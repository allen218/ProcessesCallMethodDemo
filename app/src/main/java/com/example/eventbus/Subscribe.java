package com.example.eventbus;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * .
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Subscribe {
    ThreadMode threadMode() default ThreadMode.PostThread;
}
