package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dtos.authors.CreateAuthorForm;
import org.example.dtos.authors.UpdateAuthorForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/authors")
public interface AuthorController {

    @GetMapping("/create")
    String createAuthorForm(
            Principal principal,
            Model model
    );

    @PostMapping("/create")
    String createAuthor(
            @Valid @ModelAttribute("form") CreateAuthorForm form,
            BindingResult bindingResult,
            Principal principal,
            Model model
    );

    @GetMapping
    String getAll(
            Principal principal,
            Model model
    );

    @GetMapping("/update/{id}")
    String updateAuthorForm(
            @PathVariable("id") Long id,
            Principal principal,
            Model model);

    @PostMapping("/update")
    String updateAuthor(
            @Valid @ModelAttribute("form") UpdateAuthorForm form,
            BindingResult bindingResult,
            Principal principal,
            Model model
    );

    @GetMapping("/delete/{id}")
    String deleteAuthor(
            @PathVariable("id") Long id,
            Principal principal,
            Model model
    );
}
