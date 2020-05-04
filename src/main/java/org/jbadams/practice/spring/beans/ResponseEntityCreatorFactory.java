package org.jbadams.practice.spring.beans;

import java.util.List;

public interface ResponseEntityCreatorFactory {

    public void createReponseEntityCreator();
    public Writer createResponseEntity();
    public void addItem(String item);
    public String getItem(int idx);
    public List<String> getItems();
}