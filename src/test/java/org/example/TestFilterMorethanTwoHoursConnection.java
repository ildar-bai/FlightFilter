package org.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestFilterMorethanTwoHoursConnection {
    FlightFilter FilterMorethanTwoHoursConnection = new FilterMorethanTwoHoursConnection();

    @Test
    public void testFilter() {
        assertEquals(FilterMorethanTwoHoursConnection.filter(FlightBuilder.createFlights()).toString(),
                Arrays.asList(FlightBuilder.createFlights().get(0), FlightBuilder.createFlights().get(1),
                        FlightBuilder.createFlights().get(2), FlightBuilder.createFlights().get(3)).toString());
    }
}