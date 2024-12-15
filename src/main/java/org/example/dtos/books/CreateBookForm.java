package org.example.dtos.books;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record CreateBookForm(
        @NotBlank(message = "title cannot be empty")
        String name,
        @Min(value = 1, message = "price must be positive")
        Double price,
        @Min(value = 1500, message = "wrong publication year")
        @Max(value = 2024, message = "wrong publication year")
        Integer publicationYear,
        List<Long> genreIds,
        List<Long> authorIds
) {}
