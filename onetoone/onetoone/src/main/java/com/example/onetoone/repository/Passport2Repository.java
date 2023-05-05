package com.example.onetoone.repository;

import com.example.onetoone.model.Passport2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface Passport2Repository extends JpaRepository<Passport2, Long> {
}
