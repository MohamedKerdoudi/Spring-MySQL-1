package com.management.repositories;


import com.management.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture , Long> {
    Facture save(Facture facture);
}
