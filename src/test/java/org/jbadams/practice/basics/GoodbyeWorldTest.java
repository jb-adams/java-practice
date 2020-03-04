package org.jbadams.practice.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodbyeWorldTest {

    @Test
    public void verifyFarewell() {
        System.out.println("Testing verifyFarewell() method");
        String expected = "so long, until next time!";   
        String actual = GoodbyeWorld.farewell();
        Assert.assertEquals(actual, expected);
    }
}