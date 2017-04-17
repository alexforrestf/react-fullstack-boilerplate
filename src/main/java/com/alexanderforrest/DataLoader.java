package com.alexanderforrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Alex on 17/04/2017.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final PostRepository repository;

    @Autowired
    public DataLoader(PostRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Post("New Title 1", "Description 1 here"));
        this.repository.save(new Post("New Title 2", "Description 2 here"));
        this.repository.save(new Post("New Title 3", "Description 3 here"));
        this.repository.save(new Post("New Title 4", "Description 4 here"));
        this.repository.save(new Post("New Title 5", "Description 5 here"));
        this.repository.save(new Post("New Title 6", "Description 6 here"));
    }
}
