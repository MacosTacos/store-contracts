package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dtos.CreateBookForm;
import org.example.dtos.SearchForm;
import org.example.input.BookFilterInputModel;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("books")
public interface BookController {

    @GetMapping("/{id}")
    String singleBookPage(
            @PathVariable("id") Integer id,
            Model model
    );

    @GetMapping
    String mainPage(
            Model model
    );

    @GetMapping("search")
    String search(
            @ModelAttribute("form") SearchForm form,
            Model model
    );

    @GetMapping("create")
    String createBookForm(
            Model model
    );

    @PostMapping("create")
    String createBook(
            @Valid @ModelAttribute("form") SearchForm form,
            BindingResult bindingResult,
            Model model
    );

    @GetMapping("/update/{id}")
    String updateBookForm(
            @PathVariable Long id,
            Model model
    );

    @PutMapping("/update/{id}")
    String updateBook(
            @PathVariable("id") Long id,
            @Valid @ModelAttribute("form") CreateBookForm form,
            BindingResult bindingResult,
            Model model
            );

    @GetMapping("/delete/{id}")
    String deleteBook(
            @PathVariable("id") Long id,
            Model model
    );


}
