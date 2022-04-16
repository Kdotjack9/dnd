package com.axiom.dnd.character.lineage;

import com.axiom.dnd.character.AbilityName;
import com.axiom.dnd.character.Size;
import com.axiom.dnd.character.SizeName;

import java.util.HashMap;

public class Dwarf extends Lineage{
    @Override
    public void initialize() {
        this.abilityModifiers = new HashMap<>();
        initializeAbilityModifier(AbilityName.CON, 2);
        this.size = new Size(SizeName.MEDIUM);
        this.speed = 30;
    }
}
