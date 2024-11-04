package com.javalearning.designpattern.behaviourpattern.template.solution;

public class CVSProcessor extends DataProcessor{
    @Override
    protected String loadData() {
        System.out.println("Loading the CSV data...");
        return "mohit,123,45";
    }

    @Override
    protected void parseData(String data) {
        System.out.println("Parsing the CSV data..." + data);
    }
}
