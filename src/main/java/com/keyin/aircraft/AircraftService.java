package com.keyin.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {
    @Autowired
    private AircraftRepository aircraftRepository;
    
    
    public List<Aircraft> getAllAircraft() {
        return (List<Aircraft>) aircraftRepository.findAll();
    }

    public List<Aircraft> findAircraftByPrams(AircraftSearchPrams aircraftSearchPrams) {
        return aircraftRepository.findByType(aircraftSearchPrams.getType());
    }

    public Aircraft createAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }
}
