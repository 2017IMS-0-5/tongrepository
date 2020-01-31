package com.example.webproject.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String hobby;

    public Hobby() {
    }

    public Hobby(String name,String hobby) {
        this.name=name;
        this.hobby=hobby;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
