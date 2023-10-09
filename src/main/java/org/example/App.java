package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Flight> flights = FlightBuilder.createFlights();

        FlightFilter departureBeforeCurrentFilter = new FilterDepartureBeforeCurrentTime();
        System.out.println(departureBeforeCurrentFilter.filter(flights));

        FlightFilter depBeforeArrFilter = new FilterDepartureBeforeArrival();
        System.out.println(depBeforeArrFilter.filter(flights));

        FlightFilter moreThan2Filter = new FilterMorethanTwoHoursConnection();
        System.out.println(moreThan2Filter.filter(flights));
    }
}
