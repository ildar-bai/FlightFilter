package org.example;

import java.util.List;

public interface FlightFilter {
    public abstract List<Flight> filter(List<Flight> originList);
}
