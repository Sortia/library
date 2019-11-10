package com.example.sweater.repos.books;

import com.example.sweater.domain.books.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface PublisherRepo extends JpaRepository<Publisher, Long> {
    Long deleteById(Integer id);

    Publisher findById(Integer id);

    @Transactional
    @Modifying
    @Query("update Publisher g set g.name = ?1 where g.id = ?2")
    void setNameById(String name, Integer id);
}
