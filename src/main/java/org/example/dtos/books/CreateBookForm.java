package org.example.dtos.books;

import jakarta.validation.constraints.*;

import java.util.List;

public class CreateBookForm {
    private String name;
    private String description;
    private Double price;
    private Integer publicationYear;
    private List<Long> genreIds;
    private List<Long> authorIds;

    public CreateBookForm() {
    }

    @NotBlank(message = "title cannot be empty")
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Positive(message = "price must be positive")
    @NotNull(message = "price cannot be null")
    public Double getPrice() {
        return price;
    }

    @Min(value = 1500, message = "wrong publication year")
    @NotNull(message = "price cannot be null")
    public Integer getPublicationYear() {
        return publicationYear;
    }

    public List<Long> getGenreIds() {
        return genreIds;
    }

    public List<Long> getAuthorIds() {
        return authorIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setGenreIds(List<Long> genreIds) {
        this.genreIds = genreIds;
    }

    public void setAuthorIds(List<Long> authorIds) {
        this.authorIds = authorIds;
    }
}
