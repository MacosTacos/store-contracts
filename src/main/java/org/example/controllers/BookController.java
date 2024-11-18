package org.example.controllers;

import org.example.input.BookFilterInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("books")
public interface BookController {

    @GetMapping("/{id}")
    String singleBookPage(
            @ModelAttribute("currentUser") String currentUser,
            @PathVariable("id") Integer id,
            Model model
            );

    @GetMapping
    String mainPage(
            @ModelAttribute("currentUser") String currentUser,
            Model model
    );

    @GetMapping("search")
    String search(
            @ModelAttribute("filter")BookFilterInputModel filter,
            Model model
            );
}
