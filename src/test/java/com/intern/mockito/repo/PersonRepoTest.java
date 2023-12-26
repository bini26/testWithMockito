package com.intern.mockito.repo;

import com.intern.mockito.entity.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo repo;

    @Test
    void isPersonExistById() {
//        Person person = new Person(101,"Binod Pandey","Badera");
//        repo.save(person);

        Boolean actualResult = repo.isPersonExistById(101);

        Assertions.assertThat(actualResult).isTrue();

    }
}