package org.example.controllers;

import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.dtos.auth.LoginForm;
import org.example.dtos.auth.RegistrationForm;
import org.example.input.UserAuthenticationInputModel;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping("/users")
public interface AuthController {

    @GetMapping("/register")
    String register(Model model);

    @PostMapping("/register")
    String register(
            @Valid @ModelAttribute("form") RegistrationForm form,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping("/login")
    String login();

    @PostMapping("/login-error")
    String onFailedLogin(
            @ModelAttribute(UsernamePasswordAuthenticationFilter.SPRING_SECURITY_FORM_USERNAME_KEY) String username,
            RedirectAttributes redirectAttributes);

}
