package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDepartureBeforeArrival implements FlightFilter{
    public List<Flight> filter(List<Flight> flights){

        return flights.stream()
                .filter(flight -> !isDepartureBeforeArrival(flight))
                .collect(Collectors.toList());
    }

    public boolean isDepartureBeforeArrival(Flight flight){
        List<Segment> segments = flight.getSegments();
        for (int i = 0; i < segments.size(); i++) {
            if (segments.get(i).getArrivalDate().isBefore(segments.get(i).getDepartureDate()))
                return true;
        }
        return false;
    }
}
