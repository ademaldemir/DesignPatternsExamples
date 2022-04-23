package com.designpatterns.bridge.reportapp;

public class App {
    public static void main(String[] args) {
        Report employeePerformanceReport = new EmployeePerformanceReport(new DesktopFormat());
        employeePerformanceReport.display();

        System.out.println("🥥🥥🥥🥥🥥🥥🥥🥥🥥🥥🥥");
        Report salesReport = new SalesReport(new WebFormat());
        salesReport.display();
    }
}
