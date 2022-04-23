package com.designpatterns.facade.bookingsystem;

public class TrainBooking {
    public TrainBooking() {
    }

    public void bookTrain(BookingInfo info) {
        System.out.println("Train Booked. From " + info.Destination + " to " + info.source + ".");
    }
}
