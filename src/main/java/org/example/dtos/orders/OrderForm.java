package org.example.dtos.orders;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record OrderForm(
        @NotNull(message = "order must contain at least one book")
        List<Integer> bookIds
) {
}
