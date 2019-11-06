package com.example.sweater.controller;

import com.example.sweater.domain.books.Directory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

abstract public class DirectoryController {

    protected JpaRepository repo;

    protected Directory directory;

    protected abstract Directory getDirectory();

    protected abstract JpaRepository getRepository();

    @GetMapping
    public String index(Model model) {

        directory = getDirectory();
        repo = getRepository();

        directory.setName("HALLO WORLD!");
        repo.save(directory);

        return "directories/genre/list";
    }

    @PostMapping("store")
    public String store() {
        return "directories/genre/form";
    }

    @GetMapping("delete")
    public String delete() {
        return "directories/genre/form";
    }


}
