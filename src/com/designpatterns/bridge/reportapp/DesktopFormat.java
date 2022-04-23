package com.designpatterns.bridge.reportapp;

public class DesktopFormat implements ReportFormat{
    @Override
    public void generate() {
        System.out.println("Desktop Formated Report Created.");
    }
}
