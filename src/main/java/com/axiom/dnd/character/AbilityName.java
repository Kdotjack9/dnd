package com.axiom.dnd.character;

public enum AbilityName {
    STR ("strength"),
    DEX ("dexterity"),
    CON ("constitution"),
    INT ("intelligence"),
    WIS ("wisdom"),
    CHA ("charisma");

    private final String name;

    AbilityName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
