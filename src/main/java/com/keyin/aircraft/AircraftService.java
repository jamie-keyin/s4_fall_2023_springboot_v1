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

    public Aircraft createAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);

        return aircraft;
    }
}
