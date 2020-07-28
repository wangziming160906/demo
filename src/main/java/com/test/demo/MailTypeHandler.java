package com.test.demo;

import com.test.demo.MAILTYPE;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface MailTypeHandler {
    MAILTYPE value();
}
