package com.java.librarymanagementsystem;

public class Book extends LibraryItems {
    public Book(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowItem(User user) {
        if(isBorrowed){
            isBorrowed = true;
            System.out.println(user+"borrowed the book"+getTitle());
        }else{
            System.out.println("The book"+getTitle()+"is already borrowed");
        }
    }


}
