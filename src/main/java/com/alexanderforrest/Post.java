package com.alexanderforrest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * Created by Alex on 17/04/2017.
 */
@Data
@Entity
public class Post {
    private @Id @GeneratedValue Long id;
    private String title;
    private String description;

    public Post() {}

    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
