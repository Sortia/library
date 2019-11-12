package com.example.sweater.controller;

import com.example.sweater.repos.books.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private final ActivityRepo activityRepo;
    private final AuthorRepo authorRepo;
    private final DepartmentRepo departmentRepo;
    private final FormatRepo formatRepo;
    private final GenreRepo genreRepo;
    private final KeywordRepo keywordRepo;
    private final PublisherRepo publisherRepo;
    private final StateRepo stateRepo;
    private final TypeRepo typeRepo;

    public BookController(ActivityRepo activityRepo, AuthorRepo authorRepo, DepartmentRepo departmentRepo,
                          FormatRepo formatRepo, GenreRepo genreRepo, KeywordRepo keywordRepo,
                          PublisherRepo publisherRepo, StateRepo stateRepo, TypeRepo typeRepo) {
        this.activityRepo = activityRepo;
        this.authorRepo = authorRepo;
        this.departmentRepo = departmentRepo;
        this.formatRepo = formatRepo;
        this.genreRepo = genreRepo;
        this.keywordRepo = keywordRepo;
        this.publisherRepo = publisherRepo;
        this.stateRepo = stateRepo;
        this.typeRepo = typeRepo;
    }

    @GetMapping
    public String index(Model model) {

        model.addAttribute("activities", activityRepo.findAll());
        model.addAttribute("authors", authorRepo.findAll());
        model.addAttribute("departments", departmentRepo.findAll());
        model.addAttribute("formats", formatRepo.findAll());
        model.addAttribute("genres", genreRepo.findAll());
        model.addAttribute("keywords", keywordRepo.findAll());
        model.addAttribute("publishers", publisherRepo.findAll());
        model.addAttribute("states", stateRepo.findAll());
        model.addAttribute("types", typeRepo.findAll());

        return "books";
    }

    @ResponseBody
    @PostMapping("store/{id}")
    public String store(@PathVariable String id) {
        return "";
    }

    @ResponseBody
    @GetMapping("delete/{id}")
    public String delete(@PathVariable String id) {
        return "";
    }


}
/*
    activity
    author
    department
    format
    genre
    keyword
    publisher
    state
    type
 */