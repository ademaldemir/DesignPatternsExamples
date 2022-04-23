package com.designpatterns.facade.bookingsystem;

public class FlightBooking {
    public FlightBooking() {
    }

    public void bookFlight(BookingInfo info) {
        System.out.println("Flight Booked. From "+ info.Destination + " to " + info.source + ".");
    }
}
