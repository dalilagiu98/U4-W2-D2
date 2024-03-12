package exercise3;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

   public static  Map<String, String> phoneBook = new HashMap<>();

    //  METHOD TO INSERT KEY-VALUE PAIRS:
    public static void addContact(String name, String numberPhone) {
        phoneBook.put(name, numberPhone);
    }

    //  METHOD TO REMOVE KEY-VALUE PAIRS:
    public static void removeContact(String name) {
        phoneBook.remove(name);
    }

    //  METHOD TO SEARCH A PERSON BY THE PHONE NUMBER:
    public static void searchByPhoneNumber(String phone) {

    }

    //  METHOD TO SEARCH A PERSON BY THE NAME:
    public static void searchByName(String name) {
        String phoneNumber = phoneBook.get(name);
        System.out.println(phoneNumber != null ? phoneNumber : "Name not found!");
    }

    //  METHOD TO PRINT ALL CONTACTS WITH NAME AND PHONE NUMBER:
    public static void printAllContacts() {
        for(String name : phoneBook.keySet()) {
            System.out.println("Name: " + name + ", Phone Number: " + phoneBook.get(name));
        }
    }
}
