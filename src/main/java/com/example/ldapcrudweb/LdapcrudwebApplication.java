package com.example.ldapcrudweb;

import com.example.ldapcrudweb.data.domain.Person;
import com.example.ldapcrudweb.data.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class LdapcrudwebApplication {

    private static Logger log = LoggerFactory.getLogger(LdapcrudwebApplication.class);

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(LdapcrudwebApplication.class, args);
    }

    @PostConstruct
    public void setup() {
        log.info("Spring LDAP CRUD Operations Binding and Unbinding Example");

        List<Person> persons = personRepository.findAll();
        persons.stream().forEach(System.out::println);
    }
}
