package org.example.dtos.books;

import org.example.dtos.genres.GenreView;
import org.springframework.data.domain.Page;

import java.util.List;

public class BookByGenreView {
    private Page<BookView> books;
    private List<GenreView> genres;

    public BookByGenreView(Page<BookView> books, List<GenreView> genres) {
        this.books = books;
        this.genres = genres;
    }

    public Page<BookView> getBooks() {
        return books;
    }

    public void setBooks(Page<BookView> books) {
        this.books = books;
    }

    public List<GenreView> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreView> genres) {
        this.genres = genres;
    }
}
