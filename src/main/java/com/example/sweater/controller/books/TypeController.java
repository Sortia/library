package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Type;
import com.example.sweater.repos.books.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/types")
public class TypeController extends DirectoryController {
    @Autowired
    protected TypeRepo repo;

    protected String path = "types";

    @Override
    protected Type getDirectory() {
        return new Type();
    }

    @Override
    protected TypeRepo getRepository() {
        return repo;
    }

    @Override
    protected String getPath() {
        return "types";
    }

    protected String getName() {
        return "Types";
    }

    protected void update(Integer id, String name) {
        repo.setNameById(name, id);
    }

    protected void create(String name) {
        Type type = getDirectory();
        type.setName(name);

        repo.save(type);
    }
}