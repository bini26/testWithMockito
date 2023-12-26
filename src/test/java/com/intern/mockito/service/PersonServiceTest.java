package com.intern.mockito.service;

import com.intern.mockito.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {
    @Mock
    private PersonRepo repo;


    private PersonService service;

    @BeforeEach
    void setUp(){
        this.service=new PersonService(this.repo);
    }

    @Test
    void getAllPerson() {
        service.getAllPerson();
        Mockito.verify(repo).findAll();
    }
}