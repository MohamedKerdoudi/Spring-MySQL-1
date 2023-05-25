package com.management.repositories;

import com.management.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}
