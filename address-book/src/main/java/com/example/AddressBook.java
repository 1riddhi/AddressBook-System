package main.java.com.example;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        if(!contacts.contains(contact))
        {
            contacts.add(contact);
            System.out.println("Contact added successfully.");
        }
        else {
            System.out.println("Duplicate contact entry !!!");
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void editContact(String oldName, Contact newContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(oldName)) {
                contacts.set(i, newContact);
                break;
            }
        }
    }

    public void deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name)) {
                contacts.remove(contact);
                break;
            }
        }
    }    

   
}
