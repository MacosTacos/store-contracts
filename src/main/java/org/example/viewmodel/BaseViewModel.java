package org.example.viewmodel;

public record BaseViewModel(
        String title,
        String currentUser,
        String theme,
        String language,
        String information
) {}
