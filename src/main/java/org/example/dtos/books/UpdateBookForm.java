package org.example.dtos.books;

import jakarta.validation.constraints.*;

import java.util.List;

public record UpdateBookForm(
        @Positive(message = "id must be positive")
        Long id,
        @NotBlank(message = "title cannot be empty")
        String name,
        @Positive(message = "price must be positive")
        @NotNull(message = "price cannot be null")
        Double price,
        @Min(value = 1500, message = "wrong publication year")
        @Max(value = 2024, message = "wrong publication year")
        @NotNull(message = "publication year must not be null")
        Integer publicationYear,
        String description,
        List<Long> genreIds,
        List<Long> authorIds) {
}
