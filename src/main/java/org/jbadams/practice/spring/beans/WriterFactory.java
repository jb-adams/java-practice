package org.jbadams.practice.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// public class WriterFactory extends AbstractFactoryBean<Writer> {
public class WriterFactory implements ApplicationContextAware {

    private ApplicationContext context;

    public WriterFactory() {}

    public ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public Writer createFooWriter() {
        return getContext().getBean("fooWriter", Writer.class);
    }

    public Writer createBarWriter() {
        return getContext().getBean("barWriter", Writer.class);
    }

    /*
    @Override
    protected Writer createInstance() {
        Writer w = new Writer();
        // w.setContent("any content at all");
        return w;
    }

    @Override
    public Class<Writer> getObjectType() {
        return Writer.class;
    }
    */
}