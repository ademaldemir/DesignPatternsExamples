package com.designpatterns.adapter.reportproducer;

public class App {
    public static void main(String[] args) {

        ReportProducer pdfReportAdapter = new PdfReportAdapter();
        ReportProducer wordReportAdapter = new WordReportAdapter();
        ReportService reportService = new ReportService(wordReportAdapter);
        reportService.createReport();
    }
}
