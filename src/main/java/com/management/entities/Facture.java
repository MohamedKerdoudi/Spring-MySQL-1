package com.management.entities;

import java.time.LocalDate;

public class Facture {
    private Long id;
    private double montant;
    private LocalDate date;

    // Constructeur
    public Facture(){

    }
    public Facture( Long id, double montant, LocalDate date) {

        this.id = id;
        this.montant = montant;
        this.date = date;
    }

    // Getters et setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
}

