package com.webapp.libraryrecord.genre;

import lombok.AllArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GenreService {

    private final GenreRepository genreRepository;

    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    public Genre findById(Long id) {
        return genreRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Genre not found - " + id));
    }

}
