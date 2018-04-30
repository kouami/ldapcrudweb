package com.example.ldapcrudweb.data.repository;


import com.example.ldapcrudweb.data.domain.Person;

import java.util.List;

public interface IPersonRepository {

    public List<Person> findAll();

    public void create(Person p);

    public void update(Person p);

    public Person findOne(String uid);

    public List<Person> findByName(String name);

    public void updatePassword(Person p);

    public void delete(Person p);
}
