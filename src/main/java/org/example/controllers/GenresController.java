package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dtos.genres.CreateGenreForm;
import org.example.dtos.genres.UpdateGenreForm;
import org.example.input.GenreCreateInputModel;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/genres")
public interface GenresController {

    @GetMapping(path = "create")
    String create(
            Model model
    );

    @PostMapping(path = "create")
    String create(
            @Valid @ModelAttribute("genreForm") CreateGenreForm genreForm,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping
    String getAll(
            Model model
    );

    @GetMapping(path = "update/{id}")
    String update(
            @PathVariable("id") Long id,
            Model model
    );

    @PostMapping(path = "update")
    String update(
            @Valid @ModelAttribute("updateGenreForm") UpdateGenreForm updateGenreForm,
            BindingResult bindingResult,
            Model model
    );
}
