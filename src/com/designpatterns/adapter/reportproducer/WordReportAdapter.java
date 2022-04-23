package com.designpatterns.adapter.reportproducer;

public class WordReportAdapter implements ReportProducer {
    @Override
    public void create() {
        System.out.println("Office Word report created.");
    }
}
