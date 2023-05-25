package com.management.services;

import com.management.entities.Tarif;
import com.management.repositories.TarifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarifServiceImpl implements  TarifService{
    @Autowired
    TarifRepository tarifRepository;
    @Override
    public Tarif saveTarif(Tarif tarif) {
        return tarifRepository.save(tarif);
    }

    @Override
    public Tarif updateTarif(Tarif tarif) {
        return tarifRepository.save(tarif);
    }
}
