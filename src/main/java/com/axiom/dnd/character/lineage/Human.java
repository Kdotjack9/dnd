package com.axiom.dnd.character.lineage;

import com.axiom.dnd.character.AbilityName;
import com.axiom.dnd.character.Size;
import com.axiom.dnd.character.SizeName;

import java.util.HashMap;

public class Human extends Lineage {
    @Override
    public void initialize() {
        this.abilityModifiers = new HashMap<>();
        initializeAbilityModifier(AbilityName.STR, 1);
        initializeAbilityModifier(AbilityName.DEX, 1);
        initializeAbilityModifier(AbilityName.CON, 1);
        initializeAbilityModifier(AbilityName.INT, 1);
        initializeAbilityModifier(AbilityName.WIS, 1);
        initializeAbilityModifier(AbilityName.CHA, 1);
        this.size = new Size(SizeName.MEDIUM);
        this.speed = 30;
    }
}
