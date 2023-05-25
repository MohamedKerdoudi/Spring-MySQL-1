package com.management.controllers;

import com.management.entities.Paiement;
import com.management.services.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paiements")
public class PaiementController {

    private final PaiementService paiementService;

    @Autowired
    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    // Endpoint pour créer un nouveau paiement
    @PostMapping
    public ResponseEntity<Paiement> createPaiement(@RequestBody Paiement paiement) {
        Paiement createdPaiement = paiementService.createPaiement(paiement);
        return new ResponseEntity<>(createdPaiement, HttpStatus.CREATED);
    }

    // Endpoint pour obtenir un paiement par son ID
    @GetMapping("/{paiementId}")
    public ResponseEntity<Paiement> getPaiement(@PathVariable long paiementId) {
        Paiement paiement = paiementService.getPaiement(paiementId);
        if (paiement != null) {
            return new ResponseEntity<>(paiement, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




    // Endpoint pour supprimer un paiement par son ID
    @DeleteMapping("/{paiementId}")
    public ResponseEntity<Void> deletePaiement(@PathVariable long paiementId) {
        boolean deleted = paiementService.deletePaiement(paiementId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
