package com.example.sweater.domain.books;

import com.example.sweater.domain.AuditModel;
import com.example.sweater.domain.books.Directory;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department extends AuditModel implements Directory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
