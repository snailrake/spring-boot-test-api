package com.webapp.libraryrecord.book;

import com.webapp.libraryrecord.author.AuthorService;
import com.webapp.libraryrecord.genre.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final AuthorService authorService;

    private final GenreService genreService;

    public Book create(BookDTO bookDTO) {
        return bookRepository.save(Book.builder()
                        .name(bookDTO.getName())
                        .author(authorService.readById(bookDTO.getAuthorId()))
                        .genre(genreService.findById(bookDTO.getGenreId()))
                        .pageCount(bookDTO.getPageCount())
                .build());
    }

    public Book update(Book book) {
        return bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> readAll() {
        return bookRepository.findAll();
    }

    public List<Book> readByAuthorId(Long id) {
        return bookRepository.findByAuthorId(id);
    }

}
