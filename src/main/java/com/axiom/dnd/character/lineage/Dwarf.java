package com.axiom.dnd.character.lineage;

import com.axiom.dnd.character.*;

import java.util.HashMap;
import java.util.HashSet;

public class Dwarf extends Lineage{
    @Override
    public void initialize() {
        this.abilityModifiers = new HashMap<>();
        this.abilities = new HashMap<>();
        initializeAbilityModifier(AbilityName.CON, 2);
        this.size = new Size(SizeName.MEDIUM);
        this.speed = 30;
        addAbility(generateDarkvision());
        addAbility(generateDwarvenResilience());
        initializeProficiencies();
    }

    private Ability generateDarkvision() {
        Ability ability = new Ability();
        ability.setName("Darkvision");
        return ability;
    }

    private Ability generateDwarvenResilience(){
        Ability ability = new Ability();
        ability.setName("Dwarven Resilience");
        return ability;
    }

    private void initializeProficiencies(){
        this.proficiencies = new HashSet<>();
        proficiencies.add(ProficiencyName.BATTLEAXE.toString());
        proficiencies.add(ProficiencyName.HANDAXE.toString());
        proficiencies.add(ProficiencyName.LIGHTHAMMER.toString());
        proficiencies.add(ProficiencyName.WARHAMMER.toString());
    }
}
