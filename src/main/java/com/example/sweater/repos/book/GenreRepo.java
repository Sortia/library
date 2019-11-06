package com.example.sweater.repos.book;

import com.example.sweater.domain.books.Directory;
import com.example.sweater.domain.books.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Long> {
}
