package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Keyword;
import com.example.sweater.repos.books.KeywordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/keywords")
public class KeywordController extends DirectoryController {
    @Autowired
    protected KeywordRepo repo;

    protected String path = "keywords";

    @Override
    protected Keyword getDirectory() {
        return new Keyword();
    }

    @Override
    protected KeywordRepo getRepository() {
        return repo;
    }

    @Override
    protected String getPath() {
        return "keywords";
    }

    protected String getName() {
        return "Keywords";
    }

    protected void update(Integer id, String name) {
        repo.setNameById(name, id);
    }

    protected void create(String name) {
        Keyword keyword = getDirectory();
        keyword.setName(name);

        repo.save(keyword);
    }
}