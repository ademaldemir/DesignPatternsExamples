package com.designpatterns.bridge.reportapp;

// Refined Abstraction
public class SalesReport extends Report{
    public SalesReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("Sales Report.");
        super.display();
    }
}
