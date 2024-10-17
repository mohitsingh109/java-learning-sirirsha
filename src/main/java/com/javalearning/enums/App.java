package com.javalearning.enums;

public class App {

    public static void main(String[] args) {
        Report report = new Report("CIS", ExportType.PDF);
        ExportType png = ExportType.PNG;
        System.out.println(png);
    }
}
