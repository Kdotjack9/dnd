package com.axiom.dnd.character.lineage;

import com.axiom.dnd.character.Ability;
import com.axiom.dnd.character.AbilityName;
import com.axiom.dnd.character.ProficiencyName;
import com.axiom.dnd.character.Size;

import java.util.Map;
import java.util.Set;

public abstract class Lineage {
    protected Map<String, Integer> abilityModifiers = null;
    protected Size size = null;
    protected Integer speed = null;
    protected Map<String, Ability> abilities = null;
    protected Set<String> proficiencies = null;

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

    public Set<String> getProficiencies() {
        return this.proficiencies;
    }

    public void addProficiency(ProficiencyName proficiencyName) {
        this.proficiencies.add(proficiencyName.toString());
    }
}
