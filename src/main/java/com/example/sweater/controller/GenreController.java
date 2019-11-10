package com.example.sweater.controller;

import com.example.sweater.domain.books.Genre;
import com.example.sweater.repos.book.GenreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/genre")
public class GenreController extends DirectoryController {
    @Autowired
    protected GenreRepo repo;

    protected String path = "genre";

    @Override
    protected Genre getDirectory() {
        return new Genre();
    }

    @Override
    protected GenreRepo getRepository() {
        return repo;
    }

    @Override
    protected String getPath() {
        return "genre";
    }

    protected void update(Integer id, String name) {
        repo.setNameById(name, id);
    }

    protected void create(String name)
    {
        Genre genre = getDirectory();
        genre.setName(name);

        repo.save(genre);
    }
}