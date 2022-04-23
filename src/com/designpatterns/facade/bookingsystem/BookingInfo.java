package com.designpatterns.facade.bookingsystem;

import java.util.Date;
import java.util.List;

public class BookingInfo {
    String source;
    String Destination;
    Date fromDate;
    Date toDate;
    PersonInfo person;

    public BookingInfo(String source, String destination, Date fromDate, Date toDate, PersonInfo person) {
        this.source = source;
        Destination = destination;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.person = person;
    }
}
