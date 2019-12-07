package com.example.sweater.controller;

import com.example.sweater.repos.books.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/issue")
public class IssueController {
    @GetMapping
    public String index() {
        return "issue";
    }
}
