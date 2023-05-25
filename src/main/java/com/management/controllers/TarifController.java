package com.management.controllers;

import com.management.entities.Tarif;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarifs")
public class TarifController {

    private Tarif tarif;

    public TarifController() {
        this.tarif = new Tarif();
    }

    @GetMapping
    public Tarif getTarif() {
        return tarif;
    }

    @PutMapping
    public void updateTarif(@RequestBody Tarif updatedTarif) {
        tarif.setPrixParHeure(updatedTarif.getPrixParHeure());
    }
}
