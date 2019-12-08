package com.example.sweater.repos;

import com.example.sweater.domain.Book;
import com.example.sweater.domain.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface IssueRepo  extends JpaRepository<Issue, Long> {
    @Query("select b from Book b where (select i.isIssue from Issue i where book = b) is null")
    Collection<Book> getNotIssuedBooks();

    @Query("select b from Book b inner join Issue i on i.book = b where i.isIssue = 1")
    Collection<Book> getIssuedBooks();

    Issue findByBookIdAndReaderId(Integer bookId, Integer readerId);

    @Transactional
    Long deleteById(Integer id);
}
