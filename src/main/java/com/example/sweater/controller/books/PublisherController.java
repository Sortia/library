package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Publisher;
import com.example.sweater.repos.books.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/publishers")
public class PublisherController extends DirectoryController {
    @Autowired
    protected PublisherRepo repo;

    protected String path = "publishers";

    @Override
    protected Publisher getDirectory() {
        return new Publisher();
    }

    @Override
    protected PublisherRepo getRepository() {
        return repo;
    }

    @Override
    protected String getPath() {
        return "publishers";
    }

    protected String getName() {
        return "Publishers";
    }

    protected void update(Integer id, String name) {
        repo.setNameById(name, id);
    }

    protected void create(String name) {
        Publisher publisher = getDirectory();
        publisher.setName(name);

        repo.save(publisher);
    }
}