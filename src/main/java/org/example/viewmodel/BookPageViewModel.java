package org.example.viewmodel;

import java.util.List;

public record BookPageViewModel(
        BaseViewModel baseViewModel,
        BookPageViewModel bookPageViewModel,
        List<BookPageViewModel> booksOfGenre,
        String description,
        BookFilterViewModel bookFilterViewModel
) {
}
