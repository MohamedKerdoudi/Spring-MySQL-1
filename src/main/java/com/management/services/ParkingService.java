package com.management.services;

import com.management.entities.Parking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParkingService {
    Parking saveParking(Parking parking);
    Parking updateParking(Parking parking);
    Parking getParking(Parking parking);
    List<Parking> getAllParking();

    Parking deleteParking(Parking parking);
}
