package com.axiom.dnd.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SizeTest {
    Size testObj = null;

    @Test
    public void testTinySize(){
        testObj = new Size(SizeName.TINY);
        Double frontage = 2.5;
        assertEquals(SizeName.TINY, testObj.getSizeName());
        assertEquals(frontage, testObj.getFrontage());
    }

    @Test
    public void testSmallSize(){
        testObj = new Size(SizeName.SMALL);
        Double frontage = 5.0;
        assertEquals(SizeName.SMALL, testObj.getSizeName());
        assertEquals(frontage, testObj.getFrontage());
    }

    @Test
    public void testMediumSize(){
        testObj = new Size(SizeName.MEDIUM);
        Double frontage = 5.0;
        assertEquals(SizeName.MEDIUM, testObj.getSizeName());
        assertEquals(frontage, testObj.getFrontage());
    }

    @Test
    public void testLargeSize(){
        testObj = new Size(SizeName.LARGE);
        Double frontage = 10.0;
        assertEquals(SizeName.LARGE, testObj.getSizeName());
        assertEquals(frontage, testObj.getFrontage());
    }

    @Test
    public void testHugeSize(){
        testObj = new Size(SizeName.HUGE);
        Double frontage = 15.0;
        assertEquals(SizeName.HUGE, testObj.getSizeName());
        assertEquals(frontage, testObj.getFrontage());
    }

    @Test
    public void testGargantuanSize(){
        testObj = new Size(SizeName.GARGANTUAN);
        Double frontage = 20.0;
        assertEquals(SizeName.GARGANTUAN, testObj.getSizeName());
        assertEquals(frontage, testObj.getFrontage());
    }
}
