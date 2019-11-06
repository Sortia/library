package com.example.sweater.controller;

import com.example.sweater.domain.books.Directory;
import com.example.sweater.domain.books.Genre;
import com.example.sweater.repos.book.GenreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/genre")
public class GenreController extends DirectoryController {
    @Autowired
    protected GenreRepo repo;

    @Qualifier("Genre")
    protected Directory directory;

    @Override
    protected Genre getDirectory() {
        return new Genre();
    }

    @Override
    protected GenreRepo getRepository() {
        return repo;
    }

    protected void save(Genre directory) {
        repo.save(directory);
    }
}