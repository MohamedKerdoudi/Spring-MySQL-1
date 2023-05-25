package com.management.services;

import com.management.entities.Parking;
import com.management.repositories.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {
    @Autowired
    ParkingRepository parkingRepository;
    @Override
    public Parking saveParking(Parking parking) {
        return parkingRepository.save(parking);
    }

    @Override
    public Parking updateParking(Parking parking) {
        return parkingRepository.save(parking);
    }

    @Override
    public Parking getParking(Parking parking) {
        Long id = null;
        return parkingRepository.findById(id).get();
    }

    @Override
    public List<Parking> getAllParking() {
        return parkingRepository.findAll();
    }

    @Override
    public Parking deleteParking(Parking parking) {
        return null;
    }
}
