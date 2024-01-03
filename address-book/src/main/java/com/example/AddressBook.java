package main.java.com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    //private List<Contact> contacts;
    private Map<String, List<Contact>> bookList = new HashMap<>();

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

   public void addContact(String bookName, Contact contact) {
    if (bookList.containsKey(bookName)) {
        bookList.get(bookName).add(contact);
    } else {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
        bookList.put(bookName, contacts);
    }
}

public List<Contact> getContacts(String bookName) {
    return bookList.containsKey(bookName) ? bookList.get(bookName) : new ArrayList<>();
}


  public void editContact(String bookName, String oldName, Contact newContact) {
        List<Contact> contacts = bookList.get(bookName);
        if (contacts != null) {
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getFirstName().equals(oldName)) {
                    contacts.set(i, newContact);
                    break;
                }
            }
        }
    }

    public void deleteContact(String bookName, String name) {
        List<Contact> contacts = bookList.get(bookName);
        if (contacts != null) {
            contacts.removeIf(contact -> contact.getFirstName().equals(name));
        }
    }
}
