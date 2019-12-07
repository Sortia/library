package com.example.sweater.controller;

import com.example.sweater.repos.BookRepo;
import com.example.sweater.repos.books.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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
    private final BookRepo bookRepo;

    public BookController(ActivityRepo activityRepo, AuthorRepo authorRepo, DepartmentRepo departmentRepo,
                          FormatRepo formatRepo, GenreRepo genreRepo, KeywordRepo keywordRepo,
                          PublisherRepo publisherRepo, StateRepo stateRepo, TypeRepo typeRepo, BookRepo bookRepo) {
        this.activityRepo = activityRepo;
        this.authorRepo = authorRepo;
        this.departmentRepo = departmentRepo;
        this.formatRepo = formatRepo;
        this.genreRepo = genreRepo;
        this.keywordRepo = keywordRepo;
        this.publisherRepo = publisherRepo;
        this.stateRepo = stateRepo;
        this.typeRepo = typeRepo;
        this.bookRepo = bookRepo;
    }

    @GetMapping
    public String index(Model model) {
        Collection qwe = bookRepo.getBooks(0,0,1,1,0,0);

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

//    @ResponseBody
//    @PostMapping("show")
//    public String show(@RequestParam("activity_id") Integer activityId, @RequestParam("author_id") Integer authorId,
//                       @RequestParam("department_id") Integer departmentId, @RequestParam("format_id") Integer formatId,
//                       @RequestParam("genre_id") Integer genreId, @RequestParam("keyword_id") Integer keywordId,
//                       @RequestParam("publisher_id") Integer publisherId, @RequestParam("state_id") Integer stateId,
//                       @RequestParam("type_id") Integer type_id, @RequestParam("offset") Integer offset, @RequestParam("limit") Integer limit) {
//
//
//
//        return "";
//    }

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