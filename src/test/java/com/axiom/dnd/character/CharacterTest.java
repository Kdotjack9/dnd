package com.axiom.dnd.character;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CharacterTest {
    private Character testObj = null;
    @BeforeEach
    public void setUp(){
        testObj = new Character();
    }

    @Test
    public void testCharacterInitialization(){
        testObj.initializeCharacter();
        assertEquals(0, testObj.getAbilityScore(AbilityName.STR));
        assertEquals(null, testObj.getAbilityModifier(AbilityName.STR));
    }

    @Test
    public void testCharacterCreation() {
        testObj.createCharacter();
    }

    @Test
    public void testSetStrengthScore(){
        Integer strengthScore = 12;
        Integer strengthModifier = 1;
        testObj.initializeCharacter();
        testObj.setAbilityScore(AbilityName.STR, strengthScore);
        assertEquals(strengthScore, testObj.getAbilityScore(AbilityName.STR));
        assertEquals(strengthModifier, testObj.getAbilityModifier(AbilityName.STR));
    }

    @Test
    public void testSetDexterityScore(){
        Integer dexterityScore = 13;
        Integer dexterityModifier = 1;
        testObj.initializeCharacter();
        testObj.setAbilityScore(AbilityName.DEX, dexterityScore);
        assertEquals(dexterityScore, testObj.getAbilityScore(AbilityName.DEX));
        assertEquals(dexterityModifier, testObj.getAbilityModifier(AbilityName.DEX));
    }

    @Test
    public void testSetConstitutionScore(){
        Integer constitutionScore = 14;
        Integer constitutionModifier = 2;
        testObj.initializeCharacter();
        testObj.setAbilityScore(AbilityName.CON, constitutionScore);
        assertEquals(constitutionScore, testObj.getAbilityScore(AbilityName.CON));
        assertEquals(constitutionModifier, testObj.getAbilityModifier(AbilityName.CON));
    }

    @Test
    public void testSetIntelligenceScore() {
        Integer intelligenceScore = 15;
        Integer intelligenceModifier = 2;
        testObj.initializeCharacter();
        testObj.setAbilityScore(AbilityName.INT, intelligenceScore);
        assertEquals(intelligenceScore, testObj.getAbilityScore(AbilityName.INT));
        assertEquals(intelligenceModifier, testObj.getAbilityModifier(AbilityName.INT));
    }

    @Test
    public void testSetWisdomScore() {
        Integer wisdomScore = 16;
        Integer wisdomModifier = 3;
        testObj.initializeCharacter();
        testObj.setAbilityScore(AbilityName.WIS, wisdomScore);
        assertEquals(wisdomScore, testObj.getAbilityScore(AbilityName.WIS));
        assertEquals(wisdomModifier, testObj.getAbilityModifier(AbilityName.WIS));
    }

    @Test
    public void testSetCharismaScore() {
        Integer charismaScore = 17;
        Integer charismaModifier = 3;
        testObj.initializeCharacter();
        testObj.setAbilityScore(AbilityName.CHA, charismaScore);
        assertEquals(charismaScore, testObj.getAbilityScore(AbilityName.CHA));
        assertEquals(charismaModifier, testObj.getAbilityModifier(AbilityName.CHA));
    }

    @Test
    public void testGetSkills() {
        Integer numberOfSkills = 18;
        testObj.initializeCharacter();
        Map<String, Skill> skills = testObj.getSkills();
        assertEquals(numberOfSkills, skills.size());
        assertFalse(skills.get(SkillName.ATHLETICS.toString()).isProficient());
    }

    @Test
    public void testFeats() {
        Integer numberOfFeats = 0;
        testObj.initializeCharacter();
        Map<String, Feat> feats = testObj.getFeats();
        assertEquals(numberOfFeats, feats.size());
    }

    @Test
    public void testAbilities(){
        Integer numberOfAbilities = 0;
        testObj.initializeCharacter();
        Map<String, Ability> abilities = testObj.getAbilities();
        assertEquals(numberOfAbilities, abilities.size());
    }
}
