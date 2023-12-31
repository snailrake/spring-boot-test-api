package com.webapp.libraryrecord.book;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> readAll() {
        return new ResponseEntity<>(bookService.readAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> create(@RequestBody BookDTO bookDTO) {
        return new ResponseEntity<>(bookService.create(bookDTO), HttpStatus.OK);
    }

}
