package com.example.sweater.controller.books;

import com.example.sweater.domain.books.Department;
import com.example.sweater.repos.books.DepartmentRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/directory/departments")
public class DepartmentController extends DirectoryController {

    protected final DepartmentRepo repo;

    public DepartmentController(DepartmentRepo repo) {
        this.repo = repo;
    }

    @Override
    protected Department getDirectory() {
        return new Department();
    }

    @Override
    protected DepartmentRepo getRepository() {
        return repo;
    }

    protected String getName() {
        return "Departments";
    }

    @Override
    protected String getPath() {
        return "departments";
    }

    protected void update(Integer id, String name) {
        Department department = repo.findById(id);

        department.setName(name);

        repo.save(department);
    }

    protected void create(String name) {
        Department activity = getDirectory();
        activity.setName(name);

        repo.save(activity);
    }
}