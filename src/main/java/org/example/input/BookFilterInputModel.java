package org.example.input;

import jakarta.validation.constraints.NotNull;

public class BookFilterInputModel {

    @NotNull(message = "Invalid category")
    private Integer categoryId;

}
