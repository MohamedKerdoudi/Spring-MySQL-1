package com.management.services;
import com.management.entities.Facture;
import com.management.repositories.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class FactureServiceImpl implements FactureService {
        @Autowired
        FactureRepository factureRepository;
        @Override
        public Facture saveFacture(Facture facture) {
            return factureRepository.save(facture);
        }

        @Override
        public Facture updateFacture(Facture facture) {
            return factureRepository.save(facture);
        }





    }


