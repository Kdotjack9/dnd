package com.axiom.dnd.character;

import java.util.HashMap;
import java.util.Map;

public class Character {
    private Map<String, AbilityScore> abilityScores = null;

    public void initializeCharacter() {
        initializeAbilityScores();
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
}
