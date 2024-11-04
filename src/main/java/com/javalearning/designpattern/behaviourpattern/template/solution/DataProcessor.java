package com.javalearning.designpattern.behaviourpattern.template.solution;

public abstract class DataProcessor {

    // template method
    public final void startProcessing () {
        String data = loadData();
        parseData(data);
        processData();
        saveData();
    }

    protected abstract String loadData();
    protected abstract void parseData(String data);

    protected void processData() {
        System.out.println("Processing the data...");
    }

    protected void saveData() {
        System.out.println("Saving the processed data.");
    }
}
