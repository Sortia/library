package com.example.sweater.domain;

import com.example.sweater.domain.books.*;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private Float cost;

    private String annotation;

    private String publishYear;

    private Integer numberPages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublish_year(String publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getNumber_pages() {
        return numberPages;
    }

    public void setNumber_pages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    public Format getFormatId() {
        return formatId;
    }

    public void setFormatId(Format formatId) {
        this.formatId = formatId;
    }

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public Type getTypeId() {
        return typeId;
    }

    public void setTypeId(Type typeId) {
        this.typeId = typeId;
    }

    public Keyword getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Keyword keywordId) {
        this.keywordId = keywordId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public Publisher getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Publisher publisherId) {
        this.publisherId = publisherId;
    }

    public Activity getActivityId() {
        return activityId;
    }

    public void setActivityId(Activity activityId) {
        this.activityId = activityId;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    public Author getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Author author) {
        this.authorId = author;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "format_id")
    private Format formatId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Author authorId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "genre_id")
    private Genre genreId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id")
    private Type typeId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "keyword_id")
    private Keyword keywordId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id")
    private Department departmentId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "publishing_house_id")
    private Publisher publisherId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "activity_id")
    private Activity activityId;
}
