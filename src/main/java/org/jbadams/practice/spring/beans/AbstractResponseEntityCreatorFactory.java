package org.jbadams.practice.spring.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class AbstractResponseEntityCreatorFactory implements ResponseEntityCreatorFactory, ApplicationContextAware {

    private ApplicationContext context;

    private List<String> items;

    public AbstractResponseEntityCreatorFactory() {
        items = new ArrayList<>();
    }

    @Override
    public void createReponseEntityCreator() {

        System.out.println("Creating Response Entity Creator");
        System.out.println("These are my items");
        System.out.println(getItems().toString());
    }

    @Override
    public Writer createResponseEntity() {
        createReponseEntityCreator();
        System.out.println("Creating a Response Entity from the Creator");
        return context.getBean("fooWriter", Writer.class);
    }

    @Override
    public void addItem(String item) {
        getItems().add(item);
    }

    @Override
    public String getItem(int idx) {
        return getItems().get(idx);
    }

    @Override
    public List<String> getItems() {
        return items;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public ApplicationContext getContext() {
        return context;
    }
}