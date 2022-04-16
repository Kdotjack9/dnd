package com.axiom.dnd.character;

public class Skill {
    private Boolean isProficient = false;
    private AbilityName abilityName = null;

    public void setProficient(Boolean isProficient){
        this.isProficient = isProficient;
    }

    public Boolean isProficient(){
        return this.isProficient;
    }

    public void setAbility(AbilityName abilityName){
        this.abilityName = abilityName;
    }

    public AbilityName getAbility(){
        return this.abilityName;
    }
}
