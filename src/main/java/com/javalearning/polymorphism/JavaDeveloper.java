package com.javalearning.polymorphism;

public class JavaDeveloper extends Employee {

    private String javaVersion;

    public JavaDeveloper(String name, double salary, String javaVersion) {
        super(name, salary);
        this.javaVersion = javaVersion;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }
}
