package com.axiom.dnd.character;

public enum SizeName {
    TINY ("Tiny"),
    SMALL ("Small"),
    MEDIUM ("Medium"),
    LARGE ("Large"),
    HUGE ("Huge"),
    GARGANTUAN ("Gargantuan");

    private final String name;

    SizeName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
