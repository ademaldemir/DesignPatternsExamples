package com.designpatterns.bridge.reportapp;

// Refined Abstraction
public class EmployeePerformanceReport extends Report{
    public EmployeePerformanceReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("Employee Performance Report");
        super.display();
    }
}
