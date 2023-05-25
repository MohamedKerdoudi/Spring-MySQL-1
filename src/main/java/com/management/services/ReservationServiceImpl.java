package com.management.services;

import com.management.entities.Reservation;
import com.management.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService{
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservation(Long id) {

        return null;
    }


    @Override
    public void deleteReservationById(Long id) {

    }

    @Override
    public void deleteAllReservation() {

    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
