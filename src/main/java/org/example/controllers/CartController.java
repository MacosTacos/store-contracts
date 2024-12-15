package org.example.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@RequestMapping("/cart")
public interface CartController {

    @PostMapping("/add")
    String addToCart(Principal principal,
                            @RequestParam Long id,
                            @RequestParam Integer quantity);

    @GetMapping()
    String getCart(Principal principal, Model model);

    @PostMapping("/clear")
    String clearCart(Principal principal);

    @PostMapping("/remove")
    String removeFromCart(Principal principal, @RequestParam Long id);

}
