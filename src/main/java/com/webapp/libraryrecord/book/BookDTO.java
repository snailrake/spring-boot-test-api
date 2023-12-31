package com.webapp.libraryrecord.book;

import lombok.Data;

@Data
public class BookDTO {
    private String name;

    private Long authorId;

    private Long genreId;

    private Integer pageCount;
}
