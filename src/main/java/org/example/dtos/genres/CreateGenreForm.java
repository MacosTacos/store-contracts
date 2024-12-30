package org.example.dtos.genres;

import jakarta.validation.constraints.NotBlank;

public class CreateGenreForm {
    private String name;

    public CreateGenreForm() {
    }

    @NotBlank(message = "name cannot be empty")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
