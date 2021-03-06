package com.axiom.dnd.character.lineage;

import com.axiom.dnd.character.AbilityName;
import com.axiom.dnd.character.ProficiencyName;
import com.axiom.dnd.character.Size;
import com.axiom.dnd.character.SizeName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DwarfLineageTest {
    Lineage testObj = null;
    @BeforeEach
    public void setUp() {
        testObj = new Dwarf();
    }
    @Test
    public void testLineageAbilityScores(){
        testObj.initialize();
        Map<String, Integer> abilityModifiers = testObj.getAbilityModifiers();
        Integer numberOfModifiersDwarf = 1;
        Integer abilityScoreModifier = 2;
        assertEquals(numberOfModifiersDwarf, abilityModifiers.size());
        assertEquals(abilityScoreModifier, abilityModifiers.get(AbilityName.CON.toString()));
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

    @Test
    public void testDarkvision(){
        testObj.initialize();
        String abilityName = "Darkvision";
        assertEquals(abilityName, testObj.getAbilities().get(abilityName).getName());
    }

    @Test
    public void testDwarvenResilience(){
        testObj.initialize();
        String abilityName = "Dwarven Resilience";
        assertEquals(abilityName, testObj.getAbilities().get(abilityName).getName());
    }

    @Test
    public void testDwarfProficiencies(){
        testObj.initialize();
        Set<String> proficiencies = testObj.getProficiencies();
        Integer numberOfProficiencies = 4;
        assertEquals(numberOfProficiencies, proficiencies.size());
        assertTrue(proficiencies.contains(ProficiencyName.BATTLEAXE.toString()));
        assertTrue(proficiencies.contains(ProficiencyName.HANDAXE.toString()));
        assertTrue(proficiencies.contains(ProficiencyName.LIGHTHAMMER.toString()));
        assertTrue(proficiencies.contains(ProficiencyName.WARHAMMER.toString()));
    }
}
