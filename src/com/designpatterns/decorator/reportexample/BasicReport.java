package com.designpatterns.decorator.reportexample;

public class BasicReport implements Report{
    private String text;

    public BasicReport(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
