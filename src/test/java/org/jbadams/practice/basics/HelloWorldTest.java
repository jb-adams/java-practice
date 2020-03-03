package org.jbadams.practice.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void verifyGreeting() {
        System.out.println("Testing verifyGreeting() method");
        String expected = "hello, world!";
        String actual = HelloWorld.greeting();
        Assert.assertEquals(actual, expected);
    }
}