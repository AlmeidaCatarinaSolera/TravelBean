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
    private int price;
    @Column
    private String company;


    public PriceRequestModel() {
    }

    public PriceRequestModel(Integer id, String origin, String destination, int price, String company) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.company = company;
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
        return price;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;



    }
}
