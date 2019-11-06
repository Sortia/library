package com.example.sweater.domain;

import com.example.sweater.domain.books.Genre;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private Float cost;

    private String annotation;

    private String publish_year;

    public Integer number_pages;

    public Boolean deposit;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    private Genre genre;


}
