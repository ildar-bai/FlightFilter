package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;


public class AppTest 
{
    @Test
    public void TestFilterDepartureBeforeCurrentTime()
    {
        FlightFilter depBeforeCurrentFilter = new FilterDepartureBeforeCurrentTime();

        assertEquals(depBeforeCurrentFilter.filter(FlightBuilder.createFlights()),
                List.of(FlightBuilder.createFlights().get(0), FlightBuilder.createFlights().get(1),
                        FlightBuilder.createFlights().get(3), FlightBuilder.createFlights().get(4),
                        FlightBuilder.createFlights().get(5), FlightBuilder.createFlights().get(6)));
    }

    @Test
    public void FilterDepartureBeforeArrival()
    {
        FlightFilter depBeforeArrFilter = new FilterDepartureBeforeArrival();
        assertEquals(depBeforeArrFilter.filter(FlightBuilder.createFlights()).toString(),
                List.of(FlightBuilder.createFlights().get(2)).toString());
    }

    @Test
    public void FilterMorethanTwoHoursConnection()
    {
        FlightFilter depBeforeCurrentFilter = new FilterMorethanTwoHoursConnection();
        assertEquals(depBeforeCurrentFilter.filter(FlightBuilder.createFlights()).toString(),
                List.of(FlightBuilder.createFlights().get(2)).toString());
    }
}
