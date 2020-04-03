package com.company;

public class Person {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return surname;
    }

    public void setFirstName(String firstName) {
        this.surname = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String firstName) {
        super();
        this.name = name;
        this.surname = firstName;
    }
}
