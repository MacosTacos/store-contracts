package org.example.dtos.auth;

import jakarta.validation.constraints.NotBlank;

public record LoginForm(
        @NotBlank(message = "login can not be empty")
        String email,
        @NotBlank(message = "password cannot be empty")
        String password
) {
}
