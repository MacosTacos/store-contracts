package org.example.viewmodel;

import org.example.input.BookFilterInputModel;

import java.util.List;

public record MainPageViewModel(
        BaseViewModel baseViewModel,
        List<BooksViewModel> books,
        List<String> genres,
        BookFilterInputModel bookFilterInputModel
) {}
