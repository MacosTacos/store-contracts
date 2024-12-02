package org.example.dtos.authors;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UpdateAuthorForm(
        @Min(value = 1, message = "id must be positive")
        Long id,
        @NotBlank(message = "name cannot be null")
        String name,
        String description
) {

}
