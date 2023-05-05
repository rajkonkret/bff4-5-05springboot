package com.example.onetomany.controller;

import com.example.onetomany.model.Author;
import com.example.onetomany.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthor(@PathVariable Long id) {
        Author author = authorRepository.findByIdWithBooks(id);
        return ResponseEntity.ok(author);
    }
}