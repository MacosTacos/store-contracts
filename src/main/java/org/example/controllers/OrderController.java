package org.example.controllers;

import jakarta.validation.Valid;
import org.example.dtos.orders.OrderForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/orders")
public interface OrderController {

    @PostMapping("/create")
    String createOrder(
            @Valid @ModelAttribute("form") OrderForm form,
            BindingResult bindingResult,
            Model model
    );

}
