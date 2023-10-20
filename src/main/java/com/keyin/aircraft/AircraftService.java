package com.keyin.aircraft;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {
    private List<Aircraft> aircraftList = new ArrayList<Aircraft>();
    
    
    public List<Aircraft> getAllAircraft() {
        return aircraftList;
    }

    public List<Aircraft> findAircraftByPrams(AircraftSearchPrams aircraftSearchPrams) {
        List<Aircraft> searchResults = new ArrayList<Aircraft>();

        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getType().equalsIgnoreCase(aircraftSearchPrams.getType())) {
                searchResults.add(aircraft);
            }
        }

        return searchResults;
    }

    public Aircraft createAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);

        return aircraft;
    }
}
