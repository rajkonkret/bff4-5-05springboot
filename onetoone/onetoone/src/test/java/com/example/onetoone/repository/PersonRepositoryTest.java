package com.example.onetoone.repository;

import com.example.onetoone.model.Passport;
import com.example.onetoone.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testSavePersonWithPassport(){
        Person person = new Person();
        person.setName("John Smith");

        Passport passport = new Passport();
        passport.setNumber("ABC123");

        person.setPassport(passport);

        personRepository.save(person);

        assertNotNull(person.getId());
        assertNotNull(passport.getId());

    }
}