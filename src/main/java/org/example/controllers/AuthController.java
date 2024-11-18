package org.example.controllers;

import org.example.input.UserAuthenticationInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("authentication")
public interface AuthController {

    @GetMapping("login")
    String login(
            @ModelAttribute("input")UserAuthenticationInputModel input,
            Model model
    );

    @GetMapping("registration")
    String registration(
            @ModelAttribute("input")UserAuthenticationInputModel input,
            Model model
    );

}
