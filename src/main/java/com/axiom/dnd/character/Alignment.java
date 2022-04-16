package com.axiom.dnd.character;

public enum Alignment {
    LG ("Lawful Good"),
    NG ("Neutral Good"),
    CG ("Chaotic Good"),
    LN ("Lawful Neutral"),
    TN ("Neutral"),
    CN ("Chaotic Neutral"),
    LE ("Lawful Evil"),
    NE ("Neutral Evil"),
    CE ("Chaotic Evil");

    private final String name;

    Alignment(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
