package com.management.entities;

public class Paiement {
    private double montantPaye;
    private String methodePaiement;

    public Paiement(double montantPaye, String methodePaiement) {
        this.montantPaye = montantPaye;
        this.methodePaiement = methodePaiement;
    }

    // Getters and Setters

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public String getMethodePaiement() {
        return methodePaiement;
    }

    public void setMethodePaiement(String methodePaiement) {
        this.methodePaiement = methodePaiement;
    }
}
