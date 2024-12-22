package org.example.dtos.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record RegistrationForm(
        @NotEmpty(message = "name cannot be empty")
        String name,
        @NotEmpty(message = "login cannot be empty")
        @Email(message = "invalid email")
        String email,
        @NotEmpty(message = "password cannot be empty")
        String password,
        @NotEmpty(message = "password cannot be empty")
        String confirmPassword
) {
}
