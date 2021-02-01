package com.duchyyy.creational.prototype;

public class Book {
    private String name;
    private String [] authors;
    private int numberOfPages;

    public Book(String name, String[] authors, int numberOfPages) {
        this.name = name;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
    }

    public Book clone () {
        Book clone = new Book(name,authors,numberOfPages);

        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
