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

    public void addItem(LibraryItems libraryItems){
        libraryItems.add(libraryItems);
    }
    public  void  addUser(User user){
        userList.add(user);
    }
    public List<libraryItems> getlibraryItems(){
        return libraryItems;
    }
    public  List<User>getUserList(){
        return userList;
    }
    public void borrowedItem(String serialNumber,User user){
        for (libraryItems libraryItems : libraryItems){
            if ((libraryItems.getSerialNumber().eqvels(serialNumber)){
                if(borrowedItems.containsKey(libraryItems.getSerialNumber())){
                    System.out.println("Item"+libraryItems.getTitle()+"is already borrowed");
                    return;
                }
                borrowedItems.put(libraryItems.getSerialNumber(),user.getName());
                libraryItems.isBorrowed = true;
                System.out.println("Item"+libraryItems.getTitle()+"is successfully borrowed bu user"+user.getName());
                return;
            }
        }
        System.out.println("Item with serial number "+serialNumber+"cdoes not exist");
    }
    public void returnBorrowedItem(String serialNumber.User user){
        for (LibraryItems libraryItems : libraryItems){
            if(libraryItems.getSerialNumber().equals(serialNumber)){
                if (borrowedItems.containsKey(libraryItems.getSerialNumber())){
                    borrowedItems.remove(libraryItems.getSerialNumber());
                    libraryItems.isBorrowed = false;
                    System.out.println("Item "+libraryItems.getTitle()+"is successfully returred by user "+user.getName());
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
