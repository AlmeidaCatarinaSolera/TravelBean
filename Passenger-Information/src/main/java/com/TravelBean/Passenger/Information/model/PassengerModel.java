package com.TravelBean.Passenger.Information.model;

import jakarta.persistence.*;

@Entity
@Table(name="PassengerInfo")
public class PassengerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surName;

    @Column(nullable = false)
    private String nationality;

    @Column(nullable = false)
    private int nif;

    @Column(nullable = false)
    private int age;

    public PassengerModel() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getNationality() {
        return nationality;
    }

    public int getNif() {
        return nif;
    }

    public int getAge() {
        return age;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
