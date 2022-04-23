package com.designpatterns.facade.bookingsystem;

import com.designpatterns.facade.bookingsystem.BookingInfo;
import com.designpatterns.facade.bookingsystem.BookingType;
import com.designpatterns.facade.bookingsystem.PersonInfo;
import com.designpatterns.facade.bookingsystem.TravelFacade;

import java.util.Date;

public class TravelApp {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        Date fromDate = new Date(2022, 25, 5);
        Date sourceDate = new Date(2022, 25, 7);
        PersonInfo personInfo = new PersonInfo("Alex", 30, "Palm Beach Street CA");

        BookingInfo info = new BookingInfo("San Franciso", "Florida", fromDate, sourceDate, personInfo);
        travelFacade.book(BookingType.Flight_And_Hotel, info);
    }
}
