package org.example.viewmodel;

import org.example.input.BookFilterInputModel;

import java.util.List;

public record BookPageViewModel(
        BaseViewModel baseViewModel,
        BookPageViewModel bookPageViewModel,
        List<BookPageViewModel> booksOfGenre,
        String description,
        BookFilterInputModel bookFilterInputModel
) {
}
