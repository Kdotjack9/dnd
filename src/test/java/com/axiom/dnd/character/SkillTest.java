package com.axiom.dnd.character;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkillTest {
    Skill testObj = null;

    @BeforeEach
    public void setUp(){
        this.testObj = new Skill();
    }

    @Test
    public void testSkillProficiency(){
        testObj.setProficient(true);
        assertTrue(testObj.isProficient());
    }

    @Test
    public void testSkillAbility(){
        testObj.setAbility(AbilityName.STR);
        assertEquals(AbilityName.STR, testObj.getAbility());
    }
}
