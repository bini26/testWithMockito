package com.intern.mockito.repo;

import com.intern.mockito.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface PersonRepo extends JpaRepository<Person,Integer> {

    @Query("SELECT CASE WHEN COUNT(p)>0 THEN TRUE ELSE FALSE END FROM Person p WHERE p.personId= ?1 ")
    Boolean isPersonExistById(Integer id);
}
