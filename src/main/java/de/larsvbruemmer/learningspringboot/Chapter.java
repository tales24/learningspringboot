package de.larsvbruemmer.learningspringboot;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
class Chapter {
    @Id
    private String id;
    private String name;

    Chapter(final String name) {
        this.name = name;
    }
}
