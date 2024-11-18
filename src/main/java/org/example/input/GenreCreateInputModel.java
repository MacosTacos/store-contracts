package org.example.input;

import jakarta.validation.constraints.NotBlank;

public class GenreCreateInputModel {

    @NotBlank(message = "Name cannot be empty")
    String name;

}
