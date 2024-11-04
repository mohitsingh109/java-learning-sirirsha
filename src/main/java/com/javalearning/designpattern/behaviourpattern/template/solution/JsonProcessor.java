package com.javalearning.designpattern.behaviourpattern.template.solution;

public class JsonProcessor extends DataProcessor{
    @Override
    protected String loadData() {
        System.out.println("Loading the Json data...");
        return "mohit,123,45";
    }

    @Override
    protected void parseData(String data) {
        System.out.println("Parsing the Json data..." + data);
    }
}
