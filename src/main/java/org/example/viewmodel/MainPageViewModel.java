package org.example.viewmodel;

import java.util.List;

public record MainPageViewModel(
        BaseViewModel baseViewModel,
        List<BooksViewModel> books,
        List<String> genres,
        BookFilterViewModel bookFilterViewModel
) {}
