package com.example.android.booklistingapp;

/**
 * Created by XY on 21.5.2017.
 */

public class Book {

    private String title;

    private String author;

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

}