package com.management.repositories;


import com.management.entities.Facture;
import com.management.entities.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking, Long> {

}
