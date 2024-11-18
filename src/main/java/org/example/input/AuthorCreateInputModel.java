package org.example.input;

import jakarta.validation.constraints.NotBlank;

public class AuthorCreateInputModel {

    @NotBlank(message = "Name cannot be null")
    String name;

}
