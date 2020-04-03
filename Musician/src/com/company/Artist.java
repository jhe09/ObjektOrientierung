package com.company;

public class Artist extends com.company.Person {
    private String alias;

    public Artist(String alias, String name, String surname) {
        super(name, surname);
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}