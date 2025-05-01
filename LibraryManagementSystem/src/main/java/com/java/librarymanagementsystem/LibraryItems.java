package com.java.librarymanagementsystem;

public abstract class LibraryItems {

    String title;
    String author;
    String serialNumber;
    protected boolean isBorrowed;

    public LibraryItems(String title, String author, String serialNumber) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
        this.isBorrowed = false;
    }

    public abstract void borrowItem(User user);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}
