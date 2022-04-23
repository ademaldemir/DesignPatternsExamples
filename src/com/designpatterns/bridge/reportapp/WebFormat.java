package com.designpatterns.bridge.reportapp;

public class WebFormat implements ReportFormat{
    @Override
    public void generate() {
        System.out.println("Web Formated Report created.");
    }
}
