package com.example.sweater.repos.books;

import com.example.sweater.domain.books.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface AuthorRepo extends JpaRepository<Author, Long> {
    Long deleteById(Integer id);

    Author findById(Integer id);
}
