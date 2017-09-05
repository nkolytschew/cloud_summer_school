package com.github.nkolytschew.cloudsummerschool.mvc.web;


import com.github.nkolytschew.cloudsummerschool.dao.jpa.entity.Person;
import com.github.nkolytschew.cloudsummerschool.dao.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.stream.Stream;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @GetMapping("listAll")
    public Iterable<Person> getAllPersons() {
        return this.repository.findAll();
    }

    @GetMapping("init")
    public String initialize() {
        Stream.of("Nik", "Jonas", "Matthias")
                .forEach(it -> this.repository.save(new Person(it)));
        return "done";
    }

}
