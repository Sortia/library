package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Author;
import com.example.sweater.repos.books.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/authors")
public class AuthorController extends DirectoryController {

    @Autowired
    protected AuthorRepo repo;

    @Override
    protected Author getDirectory() {
        return new Author();
    }

    @Override
    protected AuthorRepo getRepository() {
        return repo;
    }

    protected String getName() {
        return "Authors";
    }

    @Override
    protected String getPath() {
        return "authors";
    }

    protected void update(Integer id, String name) {
//        repo.setNameById(name, id);
    } // todo

    protected void create(String name) {
        Author author = getDirectory();
//        author.setName(name);

        repo.save(author);
    } // todo
}