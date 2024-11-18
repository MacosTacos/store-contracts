package org.example.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class BookCreateInputModel {
    @NotBlank(message = "Name cannot be null")
    String name;

    @NotNull(message = "Invalid author ids")
    List<Integer> authors;

    @NotNull(message = "Invalid genre ids")
    List<Integer> genres;



}
