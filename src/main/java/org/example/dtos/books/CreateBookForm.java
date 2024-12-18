package org.example.dtos.books;

import jakarta.validation.constraints.*;

import java.util.List;

public record CreateBookForm(
        @NotBlank(message = "title cannot be empty")
        String name,
        String description,
        @Positive(message = "price must be positive")
        @NotNull(message = "price can not be null")
        Double price,
        @Min(value = 1500, message = "wrong publication year")
        @Max(value = 2024, message = "wrong publication year")
        @NotNull(message = "price can not be null")
        Integer publicationYear,
        List<Long> genreIds,
        List<Long> authorIds
) {}
