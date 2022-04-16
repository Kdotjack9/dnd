package com.axiom.dnd.character.lineage;

import com.axiom.dnd.character.AbilityName;
import com.axiom.dnd.character.Size;
import com.axiom.dnd.character.SizeName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanLineageTest {
    Lineage testObj = null;
    @BeforeEach
    public void setUp() {
        testObj = new Human();
    }
    @Test
    public void testLineageAbilityScores(){
        testObj.initialize();
        Map<String, Integer> abilityModifiers = testObj.getAbilityModifiers();
        Integer numberOfModifiersHuman = 6;
        Integer abilityScoreModifier = 1;
        assertEquals(numberOfModifiersHuman, abilityModifiers.size());
        assertEquals(abilityScoreModifier, abilityModifiers.get(AbilityName.STR.toString()));
        assertEquals(abilityScoreModifier, abilityModifiers.get(AbilityName.DEX.toString()));
        assertEquals(abilityScoreModifier, abilityModifiers.get(AbilityName.CON.toString()));
        assertEquals(abilityScoreModifier, abilityModifiers.get(AbilityName.INT.toString()));
        assertEquals(abilityScoreModifier, abilityModifiers.get(AbilityName.WIS.toString()));
        assertEquals(abilityScoreModifier, abilityModifiers.get(AbilityName.CHA.toString()));
    }

    @Test
    public void testSize(){
        testObj.initialize();
        Size size = new Size(SizeName.MEDIUM);
        assertEquals(size.getSizeName(), testObj.getSize().getSizeName());
    }

    @Test
    public void testSpeed(){
        testObj.initialize();
        Integer speed = 30;
        assertEquals(speed, testObj.getSpeed());
    }
}
