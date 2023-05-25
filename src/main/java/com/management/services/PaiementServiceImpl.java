package com.management.services;

import com.management.entities.Paiement;
import com.management.repositories.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaiementServiceImpl implements  PaiementService{
    @Autowired
    PaiementRepository paiementRepository;
    @Override
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> getAllPaiement() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement createPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement getPaiement(long paiementId) {
        return null;
    }

    @Override
    public boolean deletePaiement(long paiementId) {
        return false;
    }
}
