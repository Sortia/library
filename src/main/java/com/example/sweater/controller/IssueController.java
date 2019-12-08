package com.example.sweater.controller;

import com.example.sweater.domain.Book;
import com.example.sweater.domain.Issue;
import com.example.sweater.repos.BookRepo;
import com.example.sweater.repos.IssueRepo;
import com.example.sweater.repos.ReaderRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@Controller
@RequestMapping("/issue")
public class IssueController {

    private final ReaderRepo readerRepo;
    private final BookRepo bookRepo;
    private final IssueRepo issueRepo;

    public IssueController(ReaderRepo readerRepo, BookRepo bookRepo, IssueRepo issueRepo) {
        this.readerRepo = readerRepo;
        this.bookRepo = bookRepo;
        this.issueRepo = issueRepo;
    }


    @GetMapping
    public String index(Model model) {
        Collection<Book> issued = issueRepo.getIssuedBooks();
        Collection<Book> notIssued = issueRepo.getNotIssuedBooks();

        model.addAttribute("readers", readerRepo.findAll());
        model.addAttribute("issued", issued);
        model.addAttribute("notIssued", notIssued);

        return "issue";
    }

    @PostMapping("issue")
    public String issue(@RequestParam Integer bookId,@RequestParam Integer readerId) {
        Issue issue = new Issue();

        issue.setBook(bookRepo.findById(bookId));
        issue.setReader(readerRepo.findById(readerId));
        issue.setIssue(true);

        issueRepo.save(issue);

        return "redirect:/issue";
    }

    @PostMapping("accept")
    public String accept(@RequestParam Integer bookId,@RequestParam Integer readerId) {
        try {
            Issue issue = issueRepo.findByBookIdAndReaderId(bookId, readerId);

            issueRepo.deleteById(issue.getId());
        } catch (Exception ignored) {}

        return "redirect:/issue";
    }
}
