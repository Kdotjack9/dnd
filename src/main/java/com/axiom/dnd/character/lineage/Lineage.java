package com.axiom.dnd.character.lineage;

import com.axiom.dnd.character.Ability;
import com.axiom.dnd.character.AbilityName;
import com.axiom.dnd.character.Size;

import java.util.Map;

public abstract class Lineage {
    protected Map<String, Integer> abilityModifiers = null;
    protected Size size = null;
    protected Integer speed = null;
    protected Map<String, Ability> abilities = null;

    public abstract void initialize();

    public Map<String, Integer> getAbilityModifiers() {
        return this.abilityModifiers;
    }

    protected void initializeAbilityModifier(AbilityName abilityName, Integer modifier){
        this.abilityModifiers.put(abilityName.toString(), modifier);
    }

    public Size getSize() {
        return this.size;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public Map<String, Ability> getAbilities() {
        return this.abilities;
    }

    public void addAbility(Ability ability){
        this.abilities.put(ability.getName(), ability);
    }
}
