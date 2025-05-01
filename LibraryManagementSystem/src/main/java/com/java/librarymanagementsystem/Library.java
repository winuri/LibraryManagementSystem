package com.java.librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<LibraryItems> libraryItems;

    private List<User> userList;

    private Map<String,String> borrowedItems;

    public Library(){
        libraryItems = new ArrayList<>();
        userList = new ArrayList<>();
        borrowedItems = new HashMap<>();
    }

    public void addItem(LibraryItems libraryItem){
        libraryItems.add(libraryItem);
    }
    public  void  addUser(User user){
        userList.add(user);
    }
    public List<LibraryItems> getLibraryItems() {
        return libraryItems;
    }
    public  List<User>getUserList(){
        return userList;
    }
    public void borrowItem(String serialNumber,User user){
        for(LibraryItems libraryItem : libraryItems){
            if(libraryItem.getSerialNumber().equals(serialNumber)){
                if(borrowedItems.containsKey(libraryItem.getSerialNumber())){
                    System.out.println("Item "+libraryItem.getTitle()+" is already borrowed");
                    return;
                }
                borrowedItems.put(libraryItem.getSerialNumber(), user.getName());
                libraryItem.isBorrowed = true;
                System.out.println("Item "+libraryItem.getTitle()+" is successfully borrowed by user "+user.getName());
                return;
            }
        }
        System.out.println("Item with serial number "+serialNumber+"does not exist");
    }
    public  void returnBorrowedItem(String serialNumber,User user){
        for(LibraryItems libraryItem : libraryItems){
            if(libraryItem.getSerialNumber().equals(serialNumber)){
                if(borrowedItems.containsKey(libraryItem.getSerialNumber())){
                    borrowedItems.remove(libraryItem.getSerialNumber());
                    libraryItem.isBorrowed = false;
                    System.out.println("Item "+libraryItem.getTitle()+" is successfully returned by user "+user.getName());
                    return;
                }
            }
        }
        System.out.println("Item with serial number "+serialNumber+"does not exist");
    }
    public Map<String, String> getBorrowedItems(){
        return borrowedItems;
    }
}
