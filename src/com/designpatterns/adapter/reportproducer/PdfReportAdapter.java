package com.designpatterns.adapter.reportproducer;

public class PdfReportAdapter implements ReportProducer {
    @Override
    public void create() {
        System.out.println("PDF report created");
    }
}
