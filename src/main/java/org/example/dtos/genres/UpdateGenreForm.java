package org.example.dtos.genres;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UpdateGenreForm {
    private Long id;
    private String name;

    public UpdateGenreForm() {
    }

    @Min(value = 1, message = "id must be positive")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank(message = "name cannot be empty")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
