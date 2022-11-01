package com.TravelBean.Price.Request.model;

import jakarta.persistence.*;


@Entity
@Table(name = "PriceRequestModel")
public class PriceRequestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String origin;
    @Column(nullable = false)
    private String destination;
    @Column
    private int distance;


    public PriceRequestModel() {
    }


    public Integer getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
