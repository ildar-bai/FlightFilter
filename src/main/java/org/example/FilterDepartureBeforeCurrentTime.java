package org.example;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDepartureBeforeCurrentTime implements FlightFilter{

    public List<Flight> filter(List<Flight> flights){
        return flights.stream()
                .filter(flight -> !flight.getSegments().get(0).getDepartureDate().isBefore(LocalDateTime.now()))
                .collect(Collectors.toList());
    }
}
