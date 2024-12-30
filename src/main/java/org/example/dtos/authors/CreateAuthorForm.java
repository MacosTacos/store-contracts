package org.example.dtos.authors;

import jakarta.validation.constraints.NotBlank;

public class CreateAuthorForm {
    @NotBlank(message = "name cannot be null")
    private String name;
    private String description;

    public CreateAuthorForm(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CreateAuthorForm() {
    }

    @NotBlank(message = "name cannot be null")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
