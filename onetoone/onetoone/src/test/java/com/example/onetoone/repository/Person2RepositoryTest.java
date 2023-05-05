package com.example.onetoone.repository;

import com.example.onetoone.model.Passport2;
import com.example.onetoone.model.Person2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Person2RepositoryTest {

    @Autowired
    private Person2Repository person2Repository;

    @Autowired
    private Passport2Repository passport2Repository;

    @Test
    public void testSavePersonAndPassport() {
        Person2 person = new Person2();
        person.setName("John Smith");

        Passport2 passport2 = new Passport2();
        passport2.setNumber("ABC1234");

        person.setPassport2(passport2);
        passport2.setPerson2(person);

        person2Repository.save(person);

        assertEquals(1, person2Repository.count());
        assertEquals(1, passport2Repository.count());

        Person2 savedPerson = person2Repository.findByName("John Smith");
        assertNotNull(savedPerson.getPassport2());
    }
}