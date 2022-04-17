package com.axiom.dnd.character;

import java.util.HashMap;
import java.util.Map;

public class Character {
    private Map<String, AbilityScore> abilityScores = null;
    private Map<String, Skill> skills = null;
    private Map<String, Feat> feats = null;
    private Map<String, Ability> abilities = null;

    public void initializeCharacter() {
        initializeAbilityScores();
        initializeSkills();
        initializeFeats();
        initializeAbilities();
    }

    public void createCharacter() {

    }

    private void initializeAbilityScores() {
        abilityScores = new HashMap<String, AbilityScore>();
        abilityScores.put(AbilityName.STR.toString(), abilityScoreFactory());
        abilityScores.put(AbilityName.DEX.toString(), abilityScoreFactory());
        abilityScores.put(AbilityName.CON.toString(), abilityScoreFactory());
        abilityScores.put(AbilityName.INT.toString(), abilityScoreFactory());
        abilityScores.put(AbilityName.WIS.toString(), abilityScoreFactory());
        abilityScores.put(AbilityName.CHA.toString(), abilityScoreFactory());
    }

    private AbilityScore abilityScoreFactory(){
        AbilityScore score = new AbilityScore();
        score.initialize();
        return score;
    }

    public Integer getAbilityScore(AbilityName abilityName) {
        return this.abilityScores.get(abilityName.toString()).getScore();
    }

    public void setAbilityScore(AbilityName abilityName, Integer abilityScore){
        this.abilityScores.get(abilityName.toString()).setScore(abilityScore);
    }

    public Integer getAbilityModifier(AbilityName abilityName){
        return this.abilityScores.get(abilityName.toString()).getModifier();
    }

    public void initializeSkills() {
        this.skills = new HashMap<>();
        this.skills.put(SkillName.ATHLETICS.toString(), skillFactory(AbilityName.STR));
        this.skills.put(SkillName.ACROBATICS.toString(), skillFactory(AbilityName.DEX));
        this.skills.put(SkillName.SLEIGHTOFHAND.toString(), skillFactory(AbilityName.DEX));
        this.skills.put(SkillName.STEALTH.toString(), skillFactory(AbilityName.DEX));
        this.skills.put(SkillName.ARCANA.toString(), skillFactory(AbilityName.INT));
        this.skills.put(SkillName.HISTORY.toString(), skillFactory(AbilityName.INT));
        this.skills.put(SkillName.INVESTIGATION.toString(), skillFactory(AbilityName.INT));
        this.skills.put(SkillName.NATURE.toString(), skillFactory(AbilityName.INT));
        this.skills.put(SkillName.RELIGION.toString(), skillFactory(AbilityName.INT));
        this.skills.put(SkillName.ANIMALHANDLING.toString(), skillFactory(AbilityName.WIS));
        this.skills.put(SkillName.INSIGHT.toString(), skillFactory(AbilityName.WIS));
        this.skills.put(SkillName.MEDICINE.toString(), skillFactory(AbilityName.WIS));
        this.skills.put(SkillName.PERCEPTION.toString(), skillFactory(AbilityName.WIS));
        this.skills.put(SkillName.SURVIVAL.toString(), skillFactory(AbilityName.WIS));
        this.skills.put(SkillName.DECEPTION.toString(), skillFactory(AbilityName.CHA));
        this.skills.put(SkillName.INTIMIDATION.toString(), skillFactory(AbilityName.CHA));
        this.skills.put(SkillName.PERFORMANCE.toString(), skillFactory(AbilityName.CHA));
        this.skills.put(SkillName.PERSUASION.toString(), skillFactory(AbilityName.CHA));
    }

    public Skill skillFactory(AbilityName abilityName) {
        Skill skill = new Skill();
        skill.setAbility(abilityName);
        return skill;
    }

    public Map<String, Skill> getSkills() {
        return this.skills;
    }

    public void initializeFeats(){
        feats = new HashMap<>();
    }

    public Map<String, Feat> getFeats() {
        return feats;
    }

    public void addFeat(Feat feat) {
        this.feats.put(feat.getName(), feat);
    }

    public void initializeAbilities() {
        abilities = new HashMap<>();
    }

    public Map<String, Ability> getAbilities() {
        return abilities;
    }

    public void addAbility(Ability ability) {
        this.abilities.put(ability.getName(), ability);
    }
}
