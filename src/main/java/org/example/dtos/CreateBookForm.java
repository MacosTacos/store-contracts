package org.example.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record CreateBookForm(
        @NotBlank(message = "title cannot be empty")
        String name,
        @Min(value = 1, message = "price must be positive")
        Integer price,
        @Min(value = 1500, message = "wrong publication year")
        @Max(value = 2024, message = "wrong publication year")
        Integer publicationYear,
        List<Integer> genreIds,
        List<Integer> authorIds
) {}
