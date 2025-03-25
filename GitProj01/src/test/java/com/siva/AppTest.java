package com.siva;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testSumWithPositives() {
        App app=new App();
        int expected=500;
        int actual=app.sum(200, 300);
        assertEquals(actual,expected);
    }
    
    public void testWithNegetives() {
    	App app=new App();
        int expected=-500;
        int actual=app.sum(-200, -300);
        assertEquals(actual,expected);
    }
    public void testWithHybrid() {
    	App app=new App();
        int expected=-100;
        int actual=app.sum(200, -300);
        assertEquals(actual,expected);
    }
    
    public void testWithZeros() {
    	App app=new App();
        int expected=0;
        int actual=app.sum(0, 0);
        assertEquals(actual,expected);
    }
}
