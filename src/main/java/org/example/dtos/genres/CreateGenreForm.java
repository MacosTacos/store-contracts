package org.example.dtos.genres;

import jakarta.validation.constraints.NotBlank;

public record CreateGenreForm (
        @NotBlank(message = "name cannot be empty")
        String name
) {
        @Override
        public @NotBlank(message = "name cannot be empty") String name() {
                return name;
        }
}
