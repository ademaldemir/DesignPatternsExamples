package com.designpatterns.bridge.reportapp;

// Abstraction
public class Report {
    private ReportFormat reportFormat; // Bridge

    public Report(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public ReportFormat getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void display(){
        reportFormat.generate();
    }
}
