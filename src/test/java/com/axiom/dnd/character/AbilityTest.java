package com.axiom.dnd.character;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbilityTest {
    Ability testObj = null;
    @BeforeEach
    public void setUp(){
        this.testObj = new Ability();
    }

    @Test
    public void testName() {
        String name = "An Ability";
        testObj.setName(name);
        assertEquals(name, testObj.getName());
    }
}
