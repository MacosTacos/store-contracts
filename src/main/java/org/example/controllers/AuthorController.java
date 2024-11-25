package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dtos.authors.CreateAuthorForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/authors")
public interface AuthorController {

    @GetMapping("/create")
    String createAuthorForm(
            Model model
    );

    @PostMapping("/create")
    String createAuthor(
            @Valid @ModelAttribute("form") CreateAuthorForm form,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping("/update/{id}")
    String updateAuthorForm(
            @PathVariable("id") Long id,
            Model model);

    @PostMapping("/author/{id}")
    String updateAuthor(
            @PathVariable("id") Long id,
            @Valid @ModelAttribute("form") CreateAuthorForm form,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping("/delete/{id}")
    String deleteAuthor(
            @PathVariable("id") Long id,
            Model model
    );

}
