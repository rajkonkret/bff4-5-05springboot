package com.example.onetomany.repository;

import com.example.onetomany.model.Author;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @EntityGraph(attributePaths = "books")
    @Query("SELECT a FROM Author a WHERE a.id = :id")
    Author findByIdWithBooks(@Param("id") Long id);
}
