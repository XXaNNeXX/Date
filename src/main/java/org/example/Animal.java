package org.example;

import java.time.Instant;
import java.time.LocalDate;

public class Animal {
    private LocalDate birthday;
    private String name;

    public Animal() {
    }

    public Animal(LocalDate birthday, String name) {
        this.birthday = birthday;
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
