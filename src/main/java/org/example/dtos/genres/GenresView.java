package org.example.dtos.genres;

import java.util.List;

public class GenresView {
    private List<GenreView> genres;

    public GenresView(List<GenreView> genres) {
        this.genres = genres;
    }

    public List<GenreView> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreView> genres) {
        this.genres = genres;
    }
}
