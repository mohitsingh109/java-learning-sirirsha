package com.javalearning.designpattern.behaviourpattern.template.wrong;

//CSV Parser : List<String>
//XML Parser : List<String>
//JSON Parser : List<String>

public class CVSProcessor {

    // template method
    public void startProcessing () {
        loadData();
        parseData();
        processData();
        saveData();
    }

    private void processData() {
        System.out.println("Processing the data");
    }

    private void saveData() {
        System.out.println("Saving the CSV file");
    }

    private void parseData() {
        System.out.println("Parsing the CSV file");
    }

    private void loadData() {
        System.out.println("Loading the CSV file");
    }
}
