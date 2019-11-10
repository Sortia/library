package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Directory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

abstract public class DirectoryController {

    protected JpaRepository repo;

    protected Directory directory;

    protected String path;

    protected String name;

    protected abstract Directory getDirectory();

    protected abstract JpaRepository getRepository();

    protected abstract String getPath();

    protected abstract String getName();

    protected abstract void create(String name);

    protected abstract void update(Integer id, String name);

    public DirectoryController() {
        directory = getDirectory();
        repo = getRepository();
        path = getPath();
        name = getName();
    }

    @GetMapping
    public String index(Model model) {
        repo = getRepository();

        model.addAttribute("directories", repo.findAll());
        model.addAttribute("name", name);
        model.addAttribute("path", path);

        return "directories/list";
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

    protected void updateOrCreate(Integer id, String name) {
        Optional directory = repo.findById(id);

        if (!directory.isPresent()) {
            create(name);
        } else {
            update(id, name);
        }
    }

}
