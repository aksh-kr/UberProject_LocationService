package org.example.uberprojectlocationservice.services;

import org.example.uberprojectlocationservice.dtos.DriverLocationDto;

import java.util.List;

public interface LocationService {

    Boolean saveDriverLocation(String driverId, Double latitude, Double longitude);

    List<DriverLocationDto> getNearbyDriverLocations(Double latitude, Double longitude);
}
