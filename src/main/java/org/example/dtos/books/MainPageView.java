package org.example.dtos.books;

import java.util.List;

public class MainPageView {
    private List<BookView> detectives;
    private List<BookView> adventures;
    private List<BookView> classics;

    public MainPageView(List<BookView> detectives, List<BookView> adventures, List<BookView> classics) {
        this.detectives = detectives;
        this.adventures = adventures;
        this.classics = classics;
    }

    public List<BookView> getDetectives() {
        return detectives;
    }

    public void setDetectives(List<BookView> detectives) {
        this.detectives = detectives;
    }

    public List<BookView> getAdventures() {
        return adventures;
    }

    public void setAdventures(List<BookView> adventures) {
        this.adventures = adventures;
    }

    public List<BookView> getClassics() {
        return classics;
    }

    public void setClassics(List<BookView> classics) {
        this.classics = classics;
    }
}
