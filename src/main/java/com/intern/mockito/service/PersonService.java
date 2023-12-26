package com.intern.mockito.service;

import com.intern.mockito.entity.Person;
import com.intern.mockito.repo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepo repo;

    public List<Person> getAllPerson(){
        return this.repo.findAll();
    }
}
