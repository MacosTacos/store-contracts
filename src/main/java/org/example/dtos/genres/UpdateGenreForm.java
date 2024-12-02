package org.example.dtos.genres;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UpdateGenreForm(
        @Min(value = 1, message = "id must be positive")
        Long id,
        @NotBlank(message = "name cannot be empty")
        String name
) {
}
