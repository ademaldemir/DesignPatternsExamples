package com.designpatterns.decorator.reportexample;

public class LinedReportDecorator extends ReportDecorator{

    public LinedReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getText() {

        String text = super.getText();

        String linedText = ReportUtil.getLinedText(text);

        return linedText;
    }
}
