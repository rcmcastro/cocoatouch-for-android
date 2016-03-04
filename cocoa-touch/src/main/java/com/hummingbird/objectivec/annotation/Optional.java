package com.hummingbird.objectivec.annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Retention(CLASS)
@Target(METHOD)
@SuppressWarnings({"unchecked", "deprecation"})
public @interface Optional
{

}

