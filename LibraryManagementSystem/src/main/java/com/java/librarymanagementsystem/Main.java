package com.java.librarymanagementsystem;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("---------Library Items-------");
        library.getLibraryItems().forEach(item => System.out.println(item.getTitle()+););


    }
}