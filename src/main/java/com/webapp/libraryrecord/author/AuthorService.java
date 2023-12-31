package com.webapp.libraryrecord.author;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<Author> readAll() {
        return authorRepository.findAll();
    }

    public Author readById(Long id) {
        return authorRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Author not found - " + id));
    }

}
