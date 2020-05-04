package org.jbadams.practice.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Writer {

    private String content;

    @Autowired
    private OutputFile outputFile;

    public Writer() {}

    public void getMessage() {
        String message = "I will print the following content: '"
            + getContent() + "' to the following file: "
            + getOutputFile().getPath();
        System.out.println(message);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setOutputFile(OutputFile outputFile) {
        this.outputFile = outputFile;
    }

    public OutputFile getOutputFile() {
        return outputFile;
    }
}