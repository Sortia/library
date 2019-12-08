package com.example.sweater.controller;

import com.example.sweater.domain.Book;
import com.example.sweater.repos.BookRepo;
import com.example.sweater.repos.books.*;
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
    private final TypeRepo typeRepo;
    private final BookRepo bookRepo;

    public BookController(
        ActivityRepo activityRepo,
        AuthorRepo authorRepo,
        DepartmentRepo departmentRepo,
        FormatRepo formatRepo,
        GenreRepo genreRepo,
        KeywordRepo keywordRepo,
        PublisherRepo publisherRepo,
        TypeRepo typeRepo,
        BookRepo bookRepo
    ) {
        this.activityRepo = activityRepo;
        this.authorRepo = authorRepo;
        this.departmentRepo = departmentRepo;
        this.formatRepo = formatRepo;
        this.genreRepo = genreRepo;
        this.keywordRepo = keywordRepo;
        this.publisherRepo = publisherRepo;
        this.typeRepo = typeRepo;
        this.bookRepo = bookRepo;
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
        model.addAttribute("types", typeRepo.findAll());
        model.addAttribute("books", bookRepo.findAll());

        return "books";
    }

    @ResponseBody
    @PostMapping("store")
    public void store(
            @RequestParam Integer activityId,
            @RequestParam Integer authorId,
            @RequestParam Integer formatId,
            @RequestParam Integer genreId,
            @RequestParam Integer keywordId,
            @RequestParam Integer publisherId,
            @RequestParam Integer typeId,
            @RequestParam Integer departmentId,
            @RequestParam String name,
            @RequestParam Float cost,
            @RequestParam String year,
            @RequestParam Integer pages,
            @RequestParam String annotation
    ) {
        Book book = new Book();

        book.setActivityId(activityRepo.findById(activityId));
        book.setAuthorId(authorRepo.findById(authorId));
        book.setFormatId(formatRepo.findById(formatId));
        book.setGenreId(genreRepo.findById(genreId));
        book.setKeywordId(keywordRepo.findById(keywordId));
        book.setPublisherId(publisherRepo.findById(publisherId));
        book.setTypeId(typeRepo.findById(typeId));
        book.setDepartmentId(departmentRepo.findById(departmentId));

        book.setName(name);
        book.setCost(cost);
        book.setPublishYear(year);
        book.setNumberPages(pages);
        book.setAnnotation(annotation);

        bookRepo.save(book);
    }

}