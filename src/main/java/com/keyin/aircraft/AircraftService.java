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
        List<Aircraft> resutList = new ArrayList<Aircraft>();
        
        String tailNumber = aircraftSearchPrams.getTailNumber();
        String type = aircraftSearchPrams.getType();

        if (tailNumber != null) {
            resutList  = aircraftRepository.findByTailNumber(tailNumber);
        } else if (type != null) {
            resutList = aircraftRepository.findByType(aircraftSearchPrams.getType());;
        }

        return resutList;
    }

    public Aircraft createAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }
}
