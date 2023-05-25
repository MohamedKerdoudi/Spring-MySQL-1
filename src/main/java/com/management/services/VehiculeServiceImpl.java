package com.management.services;

import com.management.entities.Vehicule;
import com.management.repositories.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {
    @Autowired
    VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }



    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepository.findAll();
    }

    @Override
    public void deleteVehiculeById(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public void deleteAllVehicule() {
        vehiculeRepository.deleteAll();
    }
}




