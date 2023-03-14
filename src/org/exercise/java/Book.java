package org.exercise.java;

import java.util.Objects;

public class Book {
    private String title;
    private int pageNumber;
    private String author;
    private String publisher;

    public Book(String title, int pageNumber, String author, String publisher) throws RuntimeException {
        if (Objects.equals(title, "") || pageNumber <= 0 || Objects.equals(author, "") || Objects.equals(publisher, "")){
            throw new RuntimeException("niente da fare");
        }
        this.title = title;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNumber=" + pageNumber +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
