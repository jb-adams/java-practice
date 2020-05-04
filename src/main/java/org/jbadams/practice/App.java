package org.jbadams.practice;

import org.jbadams.practice.spring.beans.GetStandardsResponseEntityCreatorFactory;
import org.jbadams.practice.spring.beans.Writer;
import org.jbadams.practice.spring.beans.WriterFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private WriterFactory writerFactory;

    @Autowired
    private GetStandardsResponseEntityCreatorFactory rcf;

    public static void main(String[] args) {
        System.out.println("STARTING THE APPLICATION");
        SpringApplication.run(App.class, args);
        System.out.println("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("EXECUTING COMMANDLINE RUNNER");

        Writer writer = rcf.createResponseEntity();
        writer.getMessage();
        System.out.println("***");

        for (int i=0; i < 3; i++) {
            Writer w = getWriterFactory().createFooWriter();
            System.out.println("Writer Factory Address: " + getWriterFactory());
            System.out.println("Writer Address: " + w);
            w.getMessage();
            System.out.println("-");
        }
    }

    public WriterFactory getWriterFactory() {
        return writerFactory;
    }

    public GetStandardsResponseEntityCreatorFactory getRcf() {
        return rcf;
    }

    public void printFooWriter(@Qualifier("fooWriter") Writer writer) {
        System.out.println("fooWriter address: " + writer);
        writer.getMessage();
        System.out.println("-");
    }
}