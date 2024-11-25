package org.example.dtos.authors;

import jakarta.validation.constraints.NotBlank;

public record CreateAuthorForm(
        @NotBlank(message = "name cannot be null")
        String name,
        String description
) {
}
