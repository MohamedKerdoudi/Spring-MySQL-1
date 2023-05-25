package com.management.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int availableSpaces;
    private double pricePerHour;

    public Parking(Long id, int availableSpaces, double pricePerHour) {
        this.id = id;
        this.availableSpaces = availableSpaces;
        this.pricePerHour = pricePerHour;
    }


    public int getAvailableSpaces() {
        return availableSpaces;
    }

    public void setAvailableSpaces(int availableSpaces) {
        this.availableSpaces = availableSpaces;
    }

    public Long getId() {
        return id;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "idParking=" + id +
                ", availableSpaces='" + availableSpaces + '\'' +
                ", pricePerHour=" + pricePerHour +
                '}';


    }
}