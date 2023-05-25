package com.management.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicule {

    @Id
    private Long id;
    private String immatriculation;
    private String marque;
    private String modele;
    private int annee;

    // Constructeurs, getters et setters



    public Vehicule(String immatriculation, String marque, String modele, int annee){
            this.immatriculation = immatriculation;
            this.marque = marque;
            this.modele = modele;
            this.annee = annee;
        }

        public Long getId () {
            return id;
        }

        public void setId (Long id){
            this.id = id;
        }

        public String getImmatriculation () {
            return immatriculation;
        }

        public void setImmatriculation (String immatriculation){
            this.immatriculation = immatriculation;
        }

        public String getMarque () {
            return marque;
        }

        public void setMarque (String marque){
            this.marque = marque;
        }

        public String getModele () {
            return modele;
        }

        public void setModele (String modele){
            this.modele = modele;
        }

        public int getAnnee () {
            return annee;
        }

        public void setAnnee ( int annee){
            this.annee = annee;
        }
    }
