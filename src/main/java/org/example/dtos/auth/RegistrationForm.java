package org.example.dtos.auth;

import jakarta.validation.constraints.NotBlank;

public record RegistrationForm(
        @NotBlank(message = "name can not be empty")
        String name,
        @NotBlank(message = "login can not be empty")
        String email,
        @NotBlank(message = "password cannot be empty")
        String password,
        @NotBlank(message = "password cannot be empty")
        String confirmPassword
) {
}
