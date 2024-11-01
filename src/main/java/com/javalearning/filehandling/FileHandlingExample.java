package com.javalearning.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) throws IOException, InterruptedException {
        // File create
        createFile();

//        Thread thread1 = new Thread(() -> {
//            try {
//                writeData();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread thread2 = new Thread(() -> {
//            try {
//                deleteAFile();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();
        // Write Data to File
        writeData();

        //Read file
        //readFile();

        //delete file
        //deleteAFile();
    }

    public static void createFile() throws IOException {
        File file = new File("C1234-"+ System.currentTimeMillis() +".txt");
        if(file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exist");
        }

        //file.renameTo(new File("example1.txt"));
    }

    public static void writeData() throws IOException {
        FileWriter fileWriter = new FileWriter("example.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello, this is a test message");
        bufferedWriter.newLine();
        bufferedWriter.write("This is a second line");
        bufferedWriter.close();
        System.out.println("Successfully Saved data");
    }

    public static void readFile() throws IOException {
        //CSV, EXCEL, text
        FileReader fileReader = new FileReader("example.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int lineNumber = 1;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(lineNumber + ": " + line);
            lineNumber++;
        }

        bufferedReader.close();
    }

    public static void deleteAFile() throws InterruptedException {
        Thread.sleep(1000);
        File file = new File("example.txt");
        if(file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete a file");
        }
    }
}
