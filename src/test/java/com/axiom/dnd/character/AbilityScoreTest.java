package com.axiom.dnd.character;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbilityScoreTest {
    private AbilityScore testObj = null;

    @BeforeEach
    public void setUp(){
        testObj = new AbilityScore();
    }

    @Test
    public void testAbilityScoreInitialization(){
        Integer initScoreValue = 0;
        testObj.initialize();
        assertEquals(initScoreValue, testObj.getScore());
    }

    @Test
    public void testSetAbilityScore(){
        Integer testScore1 = 1;
        Integer testScore4 = 4;
        Integer testScore9 = 9;
        Integer testScore10 = 10;
        Integer testScore11 = 11;
        Integer testScore12 = 12;
        Integer testScore13 = 13;
        Integer testScore18 = 18;
        Integer testModifier1 = -5;
        Integer testModifier4 = -3;
        Integer testModifier9 = -1;
        Integer testModifier10 = 0;
        Integer testModifier11 = 0;
        Integer testModifier12 = 1;
        Integer testModifier13 = 1;
        Integer testModifier18 = 4;
        testObj.initialize();

        testObj.setScore(testScore1);
        assertEquals(testScore1, testObj.getScore());
        assertEquals(testModifier1, testObj.getModifier());

        testObj.setScore(testScore4);
        assertEquals(testScore4, testObj.getScore());
        assertEquals(testModifier4, testObj.getModifier());

        testObj.setScore(testScore9);
        assertEquals(testScore9, testObj.getScore());
        assertEquals(testModifier9, testObj.getModifier());

        testObj.setScore(testScore10);
        assertEquals(testScore10, testObj.getScore());
        assertEquals(testModifier10, testObj.getModifier());

        testObj.setScore(testScore11);
        assertEquals(testScore11, testObj.getScore());
        assertEquals(testModifier11, testObj.getModifier());

        testObj.setScore(testScore12);
        assertEquals(testScore12, testObj.getScore());
        assertEquals(testModifier12, testObj.getModifier());

        testObj.setScore(testScore13);
        assertEquals(testScore13, testObj.getScore());
        assertEquals(testModifier13, testObj.getModifier());

        testObj.setScore(testScore18);
        assertEquals(testScore18, testObj.getScore());
        assertEquals(testModifier18, testObj.getModifier());
    }
}
