package com.java.librarymanagementsystem;

public class Magazine extends LibraryItems{
    public Magazine(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowItem(User user) {
       if(isBorrowed) {
          isBorrowed = true;
           System.out.println(user+"borrowed the magazine"+getTitle());
       }else{
           System.out.println("The magazine"+getTitle()+"is already borrowed");
       }
    }
}
