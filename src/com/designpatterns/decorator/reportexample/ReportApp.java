package com.designpatterns.decorator.reportexample;

public class ReportApp {
    public static void main(String[] args) {
        String content = getReportContent();

        // String text = basicReportOutput(content);

        smallLinedReportOutput(content);
    }

    private static void smallLinedReportOutput(String content) {
        BasicReport basicReport = new BasicReport(content);

        LinedReportDecorator linedReportDecorator = new LinedReportDecorator(basicReport);

        SmallReportDecorator smallReportDecorator = new SmallReportDecorator(linedReportDecorator);


        System.out.println(smallReportDecorator.getText());
    }

    private static String linedReportOutput(String content) {
        BasicReport basicReport = new BasicReport(content);

        LinedReportDecorator linedReportDecorator = new LinedReportDecorator(basicReport);
        String text = linedReportDecorator.getText();

        return text;
    }

    private static String basicReportOutput(String content) {
        BasicReport basicReport = new BasicReport(content);
        String text = basicReport.getText();
        return text;
    }

    private static String getReportContent() {
        String content = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n" +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, \n" +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, \n" +
                "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        return content;
    }
}
