package com.example.sweater.controller;

import com.example.sweater.domain.books.Directory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

abstract public class DirectoryController {

    protected JpaRepository repo;

    protected Directory directory;

    protected String path;

    protected abstract Directory getDirectory();

    protected abstract JpaRepository getRepository();

    protected abstract String getPath();

    protected abstract void create(String name);

    protected abstract void update(Integer id, String name);

    public DirectoryController() {
        directory = getDirectory();
        repo = getRepository();
        path = getPath();
    }

    @GetMapping
    public String index(Model model) {
        repo = getRepository();

        model.addAttribute("directories", repo.findAll());

        return "directories/" + path + "/list";
    }

    @ResponseBody
    @PostMapping("store/{id}")
    public String store(@RequestParam("name") String name, @PathVariable Integer id) {
        updateOrCreate(id, name);

        return "success";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        repo = getRepository();

        repo.deleteById(id);

        return "redirect:/directory/" + path;
    }

    protected void updateOrCreate(Integer id, String name)
    {
        Optional directory = repo.findById(id);

        if (!directory.isPresent()) {
            create(name);
        } else {
            update(id, name);
        }
    }

}
