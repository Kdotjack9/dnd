package com.axiom.dnd.character;

public class AbilityScore {
    private Integer score = null;
    private Integer modifier = null;

    public void initialize() {
        this.score = 0;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
        setModifier(score);
    }

    public Integer getModifier() {
        return this.modifier;
    }

    public void setModifier(Integer score){
        Integer baseLow = 11;
        Integer baseHigh = 10;
        if(score < 11) {
            this.modifier = (score - baseLow) / 2;
        } else {
            this.modifier = (score - baseHigh) / 2;
        }
    }
}
