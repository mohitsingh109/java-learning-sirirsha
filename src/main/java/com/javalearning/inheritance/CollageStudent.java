package com.javalearning.inheritance;

/**
 * Person ---> Student ---> CollageStudent
 *
 * [Multi level inheritance]
 */
public class CollageStudent extends Student {

    private String collageName;

    public CollageStudent(String name, String address, String email, String course, Integer year, String collageName) {
        super(name, address, email, course, year);
        this.collageName = collageName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }
}
