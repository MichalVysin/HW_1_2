package com.company;

public enum Subject {
    CZECH ("Český jazyk\t\t\t"), ENGLISH ("Anglický jazyk\t\t"), MATH ("Matematika\t\t\t"),
    ECONOMY ("Ekonomika\t\t\t"), HISTORY ("Dějiny\t\t\t\t");

    private final String description;

    private Subject(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
