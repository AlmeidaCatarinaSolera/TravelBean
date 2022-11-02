package com.TravelBean.Flight.Reservation.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "FlightReservationModel")
public class FlightReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String company;

    @Column(nullable = false)
    private int flightNumber;

    @Column(nullable = false)
    private String flightTime;

    @Column(nullable = false)
    private String flightDate;

    @Column
    private boolean scale;

    @Column
    private boolean luggage;

    @Column(nullable = false)
    private int cabinNumber;

    @Column(nullable = false)
    private int price;

    public FlightReservationModel() {
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getTime() {
        return flightTime;
    }

    public String getDate() {
        return flightDate;
    }

    public boolean isScale() {
        return scale;
    }

    public boolean isLuggage() {
        return luggage;
    }

    public int getCabinNumber() {
        return cabinNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setTime(String time) {
        this.flightTime = time;
    }

    public void setDate(String date) {
        this.flightDate = date;
    }

    public void setScale(boolean scale) {
        this.scale = scale;
    }

    public void setLuggage(boolean luggage) {
        this.luggage = luggage;
    }

    public void setCabinNumber(int cabinNumber) {
        this.cabinNumber = cabinNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

