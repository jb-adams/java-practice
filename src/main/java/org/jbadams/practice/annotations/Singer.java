package org.jbadams.practice.annotations;

public @interface Singer {
    public String sing() default "la la la...";
}