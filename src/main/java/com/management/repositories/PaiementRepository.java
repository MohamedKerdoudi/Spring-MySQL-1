package com.management.repositories;


import com.management.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository <Paiement, Long>{
}
