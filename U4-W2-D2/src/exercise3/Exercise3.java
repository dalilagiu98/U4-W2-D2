package exercise3;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

   public static  Map<String, String> phoneBook = new HashMap<>();

   public static void main(String[] args) {
       System.out.println("----------------------- FIRST FUNCTION------------------------");
       System.out.println("I have added 4 contacts:");
       addContact("Super Mario", "46346255776");
       addContact("Super Luigi", "53465364547");
       addContact("Toad", "436276578687");
       addContact("Peach", "806544265567");
       printAllContacts();
       System.out.println("----------------------- SECOND FUNCTION------------------------");
       System.out.println("I remove Toad:");
       removeContact("Toad");
       printAllContacts();

       System.out.println("----------------------- THIRD FUNCTION------------------------");
       System.out.println("I search a contact by phone number, 53465364547 (I know is Luigi): ");
       searchByPhoneNumber("53465364547");
       System.out.println("----------------------- FOURTH FUNCTION------------------------");
       System.out.println("I search a contact by name, Super Mario (I know is 46346255776): ");
       searchByName("Super Mario");


   }

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
       String result = "";
        for(String name : phoneBook.keySet()){
            if(phone.equals(phoneBook.get(name))){
                result = name;
            }
        }
        System.out.println(!result.isEmpty() ? result : "Contact not found");
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
