package org.example.input;

import jakarta.validation.constraints.NotBlank;

public class GenreCreateInputModel {

    @NotBlank(message = "Name cannot be empty")
    String name;

    public @NotBlank(message = "Name cannot be empty") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name cannot be empty") String name) {
        this.name = name;
    }
}
