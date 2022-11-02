package com.TravelBean.Flight.Reservation.model;

import jakarta.persistence.*;

@Entity
@Table(name="PassengerInfo")
public class PassengerInformation {

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

}
