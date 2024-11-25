package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dtos.auth.LoginForm;
import org.example.input.UserAuthenticationInputModel;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("authentication")
public interface AuthController {

    @GetMapping("login")
    String login(
            @Valid @ModelAttribute("form") LoginForm form,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping("registration")
    String registration(
            @Valid @ModelAttribute("form") LoginForm form,
            BindingResult bindingResult,
            Model model
    );

}
