package com.designpatterns.adapter.reportproducer;

public class ReportService {
    private ReportProducer reportProducer;

    public ReportService(ReportProducer reportProducer) {
        this.reportProducer = reportProducer;
    }

    public void createReport() {
        reportProducer.create();
    }
}
