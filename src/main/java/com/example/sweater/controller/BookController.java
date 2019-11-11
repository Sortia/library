package com.example.sweater.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String index() {
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
