package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dtos.books.CreateBookForm;
import org.example.dtos.SearchForm;
import org.example.dtos.books.UpdateBookForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("books")
public interface BookController {

    @GetMapping("/{id}")
    String singleBookPage(
            @PathVariable("id") Long id,
            Principal principal,
            Model model
    );


    @GetMapping("/main")
    String mainPage(Principal principal,
                    Model model);

    @GetMapping("/genre")
    String booksByGenre(@RequestParam(required = false) Long id,
                        Principal principal,
                        @RequestParam(defaultValue = "0") int page,
                        @RequestParam(defaultValue = "9") int size,
                        Model model);

    @GetMapping("/list")
    String getAll(Principal principal,
                  Model model);

    @GetMapping("/search")
    String search(@RequestParam(required = false) List<Long> selectedGenres,
                  @RequestParam(required = false) List<Long> selectedAuthors,
                  @RequestParam(required = false) String name,
                  @RequestParam(defaultValue = "0") int page,
                  @RequestParam(defaultValue = "9") int size,
                  Principal principal,
                  Model model);

    @GetMapping("/create")
    String createBookForm(
            Principal principal,
            Model model
    );

    @PostMapping("/create")
    String createBook(
            @Valid @ModelAttribute("form") CreateBookForm form,
            BindingResult bindingResult,
            Principal principal,
            Model model
    );

    @GetMapping("/update/{id}")
    String updateBookForm(
            @PathVariable Long id,
            Principal principal,
            Model model
    );

    @PostMapping("/update")
    String updateBook(
            @Valid @ModelAttribute("form") UpdateBookForm form,
            BindingResult bindingResult,
            Principal principal,
            Model model
    );

    @GetMapping("/delete/{id}")
    String deleteBook(
            @PathVariable("id") Long id,
            Principal principal,
            Model model
    );


}
