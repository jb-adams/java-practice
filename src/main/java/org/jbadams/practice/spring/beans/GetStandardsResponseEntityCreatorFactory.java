package org.jbadams.practice.spring.beans;

public class GetStandardsResponseEntityCreatorFactory extends AbstractResponseEntityCreatorFactory {

    public GetStandardsResponseEntityCreatorFactory() {
        super();
        addItem("standards");
        addItem("otherStandards");
        addItem("otherStuff");
    }
}
