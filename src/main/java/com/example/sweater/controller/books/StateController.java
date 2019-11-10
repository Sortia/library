package com.example.sweater.controller.books;

import com.example.sweater.domain.books.State;
import com.example.sweater.repos.books.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/states")
public class StateController extends DirectoryController {
    @Autowired
    protected StateRepo repo;

    protected String path = "states";

    @Override
    protected State getDirectory() {
        return new State();
    }

    @Override
    protected StateRepo getRepository() {
        return repo;
    }

    @Override
    protected String getPath() {
        return "states";
    }

    protected String getName() {
        return "States";
    }

    protected void update(Integer id, String name) {
        repo.setNameById(name, id);
    }

    protected void create(String name) {
        State state = getDirectory();
        state.setName(name);

        repo.save(state);
    }
}