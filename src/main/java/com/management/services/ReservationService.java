package com.management.services;

import com.management.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation saveReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    Reservation getReservation(Long id);

    void deleteReservationById(Long id);
    void deleteAllReservation();

    List<Reservation> getAllReservations();
}
