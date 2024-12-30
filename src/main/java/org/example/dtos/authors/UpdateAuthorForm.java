package org.example.dtos.authors;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UpdateAuthorForm {
        private Long id;
        private String name;
        private String description;

        public UpdateAuthorForm() {
        }

        public UpdateAuthorForm(Long id, String name, String description) {
                this.id = id;
                this.name = name;
                this.description = description;
        }

        @Min(value = 1, message = "id must be positive")
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        @NotBlank(message = "name cannot be null")
        public  String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }
}
