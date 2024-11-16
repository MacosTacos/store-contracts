package org.example.viewmodel;

import java.util.List;

public record BooksViewModel(
        Long id,
        String name,
        Double price,
        List<String> genres,
        List<String> authors,
        String photoUrl,
        String year
        ) {}
