package org.example.dtos.books;

import org.example.dtos.authors.AuthorView;
import org.example.dtos.genres.GenreView;
import org.springframework.data.domain.Page;

import java.util.List;

public class SearchView {
    Page<BookView> results;
    List<GenreView> genres;
    List<AuthorView> authors;

    public SearchView(Page<BookView> results, List<GenreView> genres, List<AuthorView> authors) {
        this.results = results;
        this.genres = genres;
        this.authors = authors;
    }

    public Page<BookView> getResults() {
        return results;
    }

    public void setResults(Page<BookView> results) {
        this.results = results;
    }

    public List<GenreView> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreView> genres) {
        this.genres = genres;
    }

    public List<AuthorView> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorView> authors) {
        this.authors = authors;
    }
}
