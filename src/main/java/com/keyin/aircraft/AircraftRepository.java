package com.keyin.aircraft;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
    public List<Aircraft> findByType(String type);

    public List<Aircraft> findByTailNumber(String tailNumber);

    public List<Aircraft> findByBrandAndModel(String brand, String model);

}
