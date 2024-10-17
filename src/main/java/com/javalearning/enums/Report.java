package com.javalearning.enums;

public class Report {

    private String name;

    private ExportType exportType;

    public Report(String name, ExportType exportType) {
        this.name = name;
        this.exportType = exportType;
    }

    public void generateReport() {
    }
}
