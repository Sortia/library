package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Activity;
import com.example.sweater.repos.books.ActivityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/activities")
public class ActivityController extends DirectoryController {

    @Autowired
    protected ActivityRepo repo;

    @Override
    protected Activity getDirectory() {
        return new Activity();
    }

    @Override
    protected ActivityRepo getRepository() {
        return repo;
    }

    protected String getName() {
        return "Activities";
    }

    @Override
    protected String getPath() {
        return "activities";
    }

    protected void update(Integer id, String name) {
        repo.setNameById(name, id);
    }

    protected void create(String name) {
        Activity activity = getDirectory();
        activity.setName(name);

        repo.save(activity);
    }
}