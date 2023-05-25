package com.management.services;

import com.management.entities.Tarif;

public interface TarifService {
    Tarif saveTarif(Tarif tarif);
    Tarif updateTarif(Tarif tarif);
}
