package com.javalearning.designpattern.behaviourpattern.template.solution;

public class Main {

    public static void main(String[] args) {
        DataProcessor csvProcessor = new CVSProcessor();
        csvProcessor.startProcessing();

        DataProcessor xmlProcessor = new XMLProcessor();
        xmlProcessor.startProcessing();

        DataProcessor jsonProcessor = new JsonProcessor();
        xmlProcessor.startProcessing();
    }
}
