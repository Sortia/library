package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Format;
import com.example.sweater.repos.books.FormatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/formats")
public class FormatController extends DirectoryController {
    @Autowired
    protected FormatRepo repo;

    @Override
    protected Format getDirectory() {
        return new Format();
    }

    @Override
    protected JpaRepository getRepository() {
        return repo;
    }

    @Override
    protected String getPath() {
        return "formats";
    }

    protected String getName() {
        return "Formats";
    }

    protected void update(Integer id, String name) {
        repo.setNameById(name, id);
    }

    protected void create(String name) {
        Format format = getDirectory();
        format.setName(name);

        repo.save(format);
    }
}