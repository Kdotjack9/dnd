package com.axiom.dnd.character;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeatTest {
    Feat testObj = null;
    @BeforeEach
    public void setUp() {
        testObj = new Feat();
    }

    @Test
    public void testName() {
        String name = "A Feat";
        testObj.setName(name);
        assertEquals(name, testObj.getName());
    }
}
