package org.example.controllers;

import org.example.input.GenreCreateInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/genres")
public interface GenresController {

    @GetMapping
    String genres(
            Model model
    );

    @GetMapping(path = "create")
    String create(
            @ModelAttribute("inputModel")GenreCreateInputModel inputModel,
            Model model
            );
}
