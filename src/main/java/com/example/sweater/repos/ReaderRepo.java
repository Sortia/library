package com.example.sweater.repos;

import com.example.sweater.domain.Reader;
import com.example.sweater.domain.books.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ReaderRepo extends JpaRepository<Reader, Long> {
    @Transactional
    Long deleteById(Integer id);

    Reader findById(Integer id);
}
