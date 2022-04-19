package com.axiom.dnd.character;

public enum ProficiencyName {
    BATTLEAXE("Battleaxe"),
    HANDAXE("Handaxe"),
    LIGHTHAMMER("Light Hammer"),
    WARHAMMER("Warhammer");

    private final String name;

    ProficiencyName(String name){this.name = name;}

    @Override
    public String toString() {
        return this.name;
    }
}
