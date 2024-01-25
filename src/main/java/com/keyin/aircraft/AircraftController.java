package com.keyin.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @GetMapping("/aircraft")
    public List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }

    @GetMapping("/aircraft_search")
    public List<Aircraft> getAircraftByPrams(@RequestParam(required = false) String aircraftType, @RequestParam(required = false) String tailNumber) {
        AircraftSearchPrams aircraftSearchPrams = new AircraftSearchPrams();

        aircraftSearchPrams.setType(aircraftType);
        aircraftSearchPrams.setTailNumber(tailNumber);

        return aircraftService.findAircraftByPrams(aircraftSearchPrams);
    }

    @PostMapping("/aircraft")
    public Aircraft createNewAircraft(@RequestBody Aircraft aircraft) {
        return aircraftService.createAircraft(aircraft);
    }
}
