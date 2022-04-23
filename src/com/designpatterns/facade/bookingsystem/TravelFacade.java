package com.designpatterns.facade.bookingsystem;

/*
* FlightBooking, TrainBooking and HotelBooking are different sub-systems of large system : TravelFacade
* TravelFacade offers a simple interface to book one of below options
*
* Flight Booking
* Train Booking
* Hotel Booking
* Flight + Hotel booking
* Train + Hotel booking
 */
public class TravelFacade {
    FlightBooking flightBooking;
    TrainBooking trainBooking;
    HotelBooking hotelBooking;

    public TravelFacade() {
        this.flightBooking = new FlightBooking();
        this.trainBooking = new TrainBooking();
        this.hotelBooking = new HotelBooking();
    }

    public void book(BookingType type, BookingInfo info) {
        switch (type) {
            case Flight -> {
                flightBooking.bookFlight(info);
                return;
            }

            case Hotel -> {
                hotelBooking.bookFlight(info);
                return;
            }

            case Train -> {
                trainBooking.bookTrain(info);
                return;
            }

            case Flight_And_Hotel -> {
                flightBooking.bookFlight(info);
                hotelBooking.bookFlight(info);
                return;
            }

            case Train_And_Hotel -> {
                trainBooking.bookTrain(info);
                hotelBooking.bookFlight(info);
                return;
            }


        }
    }
}
