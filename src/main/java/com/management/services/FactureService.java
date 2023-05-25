package com.management.services;

import com.management.entities.Facture;
import org.springframework.stereotype.Service;

@Service
public interface FactureService {

        Facture saveFacture(Facture facture);
        Facture updateFacture(Facture facture);


}
