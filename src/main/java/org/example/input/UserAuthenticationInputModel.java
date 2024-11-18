package org.example.input;

import jakarta.validation.constraints.NotBlank;

public class UserAuthenticationInputModel {

    @NotBlank(message = "Name cannot be empty")
    String login;

    @NotBlank(message = "Password cannot be empty")
    String password;

}
