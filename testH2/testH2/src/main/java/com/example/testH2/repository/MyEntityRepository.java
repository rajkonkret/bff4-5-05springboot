package com.example.testH2.repository;

import com.example.testH2.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
