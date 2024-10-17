package com.javalearning.enums;

public enum ExportType {
    PDF("Pdf"),
    CVS("Csv"),
    PNG("Png");

    private String displayName; // data member

    ExportType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
