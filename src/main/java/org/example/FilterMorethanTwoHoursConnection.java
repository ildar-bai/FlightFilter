package org.example;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FilterMorethanTwoHoursConnection implements FlightFilter {
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> durationOfConnection(flight) <= 120)
                .collect(Collectors.toList());
    }

    public long durationOfConnection(Flight flight) {
        List<Segment> segments = flight.getSegments();
        return IntStream.range(0, segments.size() - 1)
                 .map(i -> (int) Duration.between(segments.get(i).getArrivalDate(), segments.get(i + 1).getDepartureDate()).toMinutes())
                 .sum();
    }
}
