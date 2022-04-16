package com.axiom.dnd.character;

public enum SkillName {
    ATHLETICS ("Athletics"),
    ACROBATICS ("Acrobatics"),
    SLEIGHTOFHAND ("Sleight of Hand"),
    STEALTH ("Stealth"),
    ARCANA ("Arcana"),
    HISTORY ("History"),
    INVESTIGATION ("Investigation"),
    NATURE ("Nature"),
    RELIGION ("Religion"),
    ANIMALHANDLING ("Animal Handling"),
    INSIGHT ("Insight"),
    MEDICINE ("Medicine"),
    PERCEPTION ("Perception"),
    SURVIVAL ("Survival"),
    DECEPTION ("Deception"),
    INTIMIDATION ("Intimidation"),
    PERFORMANCE ("Performance"),
    PERSUASION ("Persuasion");

    private final String name;

    SkillName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
