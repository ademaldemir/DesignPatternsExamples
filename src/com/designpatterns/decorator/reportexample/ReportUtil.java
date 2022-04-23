package com.designpatterns.decorator.reportexample;

import java.util.ArrayList;
import java.util.List;

public class ReportUtil {
    public static String getLinedText(String text) {

        String[] lineList = text.split("\n");

        String linedText = "";

        for (String eachLine :
                lineList) {

           String linedRow = addLineEveryRow(eachLine);

            linedText = linedText + linedRow;
        }
        return linedText;
    }

    private static String addLineEveryRow(String eachLine) {
        String newRow;
        if (eachLine.trim().length() == 0) {
            newRow = "\n";
        } else {
            newRow = "\n- " + eachLine;
        }
        return newRow;
    }

    public static String fitText(String text, int width) {
        String smallText = "";
        String[] rowList = text.split("\n");

        for (String eachRow :
                rowList) {
            if (eachRow.length() <= width) {
                smallText = addAndSkipNewRow(smallText, eachRow);
            } else {
                List<String> smashedList = smash(eachRow, width);

                for (String eachNewRow :
                        smashedList) {
                    smallText = addAndSkipNewRow(smallText, eachNewRow);

                }
            }
        }

        return smallText;
    }



    /*
    * width = 30
    *
    * row
    * 1 -> 45 -> (30, 15)
    * 2 -> 25 -> (25)
    * 3 -> 65 -> (30, 30, 5)
    *
    */

    private static List<String> smash(String eachRow, int width) {

        List<String> smashedRowList = new ArrayList<>();

        for (int i = 0; i <=  eachRow.length() / 30; i++ ) {
            int firstInterval = width * i;
            int lastInterval = firstInterval + width;

            if (lastInterval > eachRow.length()){
                lastInterval = eachRow.length();
            }
            String smashedRow = eachRow.substring(firstInterval, lastInterval);

            if (smashedRow.trim().length() > 0 ) {
                smashedRowList.add(smashedRow);
            }
        }
        return  smashedRowList;
    }

    private static String addAndSkipNewRow(String mainText, String addableText) {
        return mainText + addableText + "\n";
    }
}
