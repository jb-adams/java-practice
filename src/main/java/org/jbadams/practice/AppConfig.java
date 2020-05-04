package org.jbadams.practice;

import org.jbadams.practice.spring.beans.Writer;
import org.jbadams.practice.spring.beans.WriterFactory;
import org.jbadams.practice.spring.beans.GetStandardsResponseEntityCreatorFactory;
import org.jbadams.practice.spring.beans.OutputFile;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ConfigurationProperties
public class AppConfig {

    @Bean(name="writerFactory")
    public WriterFactory getWriterFactory() {
        return new WriterFactory();
    }

    @Bean(name="fooWriter")
    @Scope("prototype")
    public Writer getFooWriter() throws Exception {
        Writer w = new Writer();
        w.setContent("Foo Content!!");
        return w;
    }

    @Bean(name="barWriter")
    @Scope("prototype")
    public Writer getBarWriter() throws Exception {
        Writer w = new Writer();
        w.setContent("Bar Content!!");
        return w;
    }

    @Bean
    public OutputFile getOutputFile() {
        return new OutputFile();
    }

    /* Response Entity Creator Factories */

    @Bean
    public GetStandardsResponseEntityCreatorFactory getStandardsResponseEntityCreatorFactory() {
        return new GetStandardsResponseEntityCreatorFactory();
    }
}