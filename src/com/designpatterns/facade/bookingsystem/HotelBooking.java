package com.designpatterns.facade.bookingsystem;

public class HotelBooking {
    public HotelBooking() {
    }

    public void bookFlight(BookingInfo info){
        System.out.println("Hotel Booked. From "+ info.Destination + " to " + info.source + ".");
    }
}
