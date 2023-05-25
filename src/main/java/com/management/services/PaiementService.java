package com.management.services;

import com.management.entities.Paiement;

import java.util.List;

public interface PaiementService {
    Paiement savePaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    List<Paiement> getAllPaiement();

    Paiement createPaiement(Paiement paiement);

    Paiement getPaiement(long paiementId);

    boolean deletePaiement(long paiementId);
}
