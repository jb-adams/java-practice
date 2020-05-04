package org.jbadams.practice.aspects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SleeperTest {

    @Test
    public void sleepTest() {

        try {
            Sleeper sleeper = new Sleeper();
            System.out.println("Starting sleep for 1 second");
            sleeper.sleep1();
            System.out.println("Finished sleeping");
        } catch (InterruptedException e) {
            System.out.println("sleep interrupted");
        }
        
    }

}