package com.example.onetoone.repository;

import com.example.onetoone.model.Person2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Person2Repository extends JpaRepository<Person2, Long> {

    Person2 findByName(String name);
}
