package org.example.dtos;

public record SearchForm(
        String name,
        Integer page,
        Integer size
) {
}
