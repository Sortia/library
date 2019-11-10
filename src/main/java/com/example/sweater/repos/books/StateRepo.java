package com.example.sweater.repos.books;

import com.example.sweater.domain.books.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface StateRepo extends JpaRepository<State, Long> {
    Long deleteById(Integer id);

    State findById(Integer id);

    @Transactional
    @Modifying
    @Query("update State g set g.name = ?1 where g.id = ?2")
    void setNameById(String name, Integer id);
}
