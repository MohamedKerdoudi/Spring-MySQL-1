package com.management.entities;

public class Tarif {
    private double prixParHeure;

    public Tarif() {
        this.prixParHeure = 10.0; // Prix par défaut de 10 dhs par heure
    }

    public double getPrixParHeure() {
        return prixParHeure;
    }

    public void setPrixParHeure(double prixParHeure) {
        this.prixParHeure = prixParHeure;
    }
}
