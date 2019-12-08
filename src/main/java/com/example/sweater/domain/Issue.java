package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "issue")
public class Issue {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reader_id")
    private Reader reader;

    private Boolean isIssue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Boolean getIssue() {
        return isIssue;
    }

    public void setIssue(Boolean issue) {
        isIssue = issue;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
