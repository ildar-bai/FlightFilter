package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class TestFilterDepartureBeforeCurrentTime {
    FlightFilter departureBeforeCurrentFilter = new FilterDepartureBeforeCurrentTime();

    @Test
    public void testFilter() {
        assertEquals(departureBeforeCurrentFilter.filter(FlightBuilder.createFlights()).toString(),
                Arrays.asList(FlightBuilder.createFlights().get(0), FlightBuilder.createFlights().get(1),
                        FlightBuilder.createFlights().get(3), FlightBuilder.createFlights().get(4),
                        FlightBuilder.createFlights().get(5)).toString());
    }
}
