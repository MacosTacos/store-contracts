package org.example.dtos.authors;

import java.util.List;

public class AuthorsView {
    private List<AuthorView> authors;

    public AuthorsView(List<AuthorView> authors) {
        this.authors = authors;
    }

    public List<AuthorView> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorView> authors) {
        this.authors = authors;
    }
}
