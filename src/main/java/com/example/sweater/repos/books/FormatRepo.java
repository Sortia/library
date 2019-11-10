package com.example.sweater.repos.books;

import com.example.sweater.domain.books.Format;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface FormatRepo extends JpaRepository<Format, Long> {
    Long deleteById(Integer id);

    Format findById(Integer id);

    @Transactional
    @Modifying
    @Query("update Format g set g.name = ?1 where g.id = ?2")
    void setNameById(String name, Integer id);
}
