package org.example.controllers;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/orders")
public interface OrderController {

    @PostMapping(path = "/create")
    String createOrder(Principal principal);

    @GetMapping(path = "get/{id}")
    String getOrder(
            @PathVariable("id") Long id,
            Principal principal
    );

    @PostMapping(path = "/complete/{id}")
    String completeOrder(
            @PathVariable("id") Long id,
            Principal principal
    );

    @PostMapping(path = "/cancel/{id}")
    String cancelOrder(
            @PathVariable("id") Long id,
            Principal principal
    );
}
