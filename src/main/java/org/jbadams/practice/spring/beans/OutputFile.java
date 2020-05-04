package org.jbadams.practice.spring.beans;

public class OutputFile {

    private String path;

    public OutputFile() {
        this.path = "anyfile.txt";
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }   
}