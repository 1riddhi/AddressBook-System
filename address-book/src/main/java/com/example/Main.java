package com.example;
import java.util.Scanner;

import main.java.com.example.AddressBook;
import main.java.com.example.Contact;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(); 
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Address Book");
            System.out.println("5. Add Multiple Contacts");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
              
                case 1:
                    // Add Contact
                    System.out.print("Enter the name of the Address Book: ");
                    String addBookName = scanner.nextLine();
                    Contact newContact = createContactFromConsole();
                    addressBook.addContact(addBookName, newContact);
                    break;

                case 2:
                    // Edit Contact
                    System.out.print("Enter the name of the Address Book: ");
                    String editBookName = scanner.nextLine();
                    System.out.print("Enter the first name of the contact to edit: ");
                    String editName = scanner.nextLine();
                    Contact editedContact = createContactFromConsole();
                    addressBook.editContact(editBookName, editName, editedContact);
                    System.out.println("Contact edited successfully!");
                    break;

                case 3:
                    // Delete Contact
                    System.out.print("Enter the name of the Address Book: ");
                    String deleteBookName = scanner.nextLine();
                    System.out.print("Enter the first name of the contact to delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteBookName, deleteName);
                    System.out.println("Contact deleted successfully!");
                    break;

                case 4:
                    // Display Address Book
                    System.out.print("Enter the name of the Address Book: ");
                    String displayBookName = scanner.nextLine();
                    System.out.println("\nCurrent Address Book:");
                    addressBook.getContacts(displayBookName).forEach(System.out::println);
                    break;

                case 5:
                    // Add Multiple Contacts
                    System.out.print("Enter the name of the Address Book: ");
                    String addMultipleBookName = scanner.nextLine();
                    System.out.print("Enter the number of contacts to add: ");
                    int numberOfContacts = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    for (int i = 0; i < numberOfContacts; i++) {
                        System.out.println("\nAdding Contact #" + (i + 1));
                        Contact multipleContact = createContactFromConsole();
                        addressBook.addContact(addMultipleBookName, multipleContact);
                    }

                    System.out.println("Multiple contacts added successfully!");
                    break;

                case 6:
                    // Exit
                    System.out.println("Exit !!!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private static Contact createContactFromConsole() {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();

        System.out.print("Enter First Name: ");
        contact.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        contact.setLastName(scanner.nextLine());

        System.out.print("Enter Address: ");
        contact.setAddress(scanner.nextLine());

        System.out.print("Enter City: ");
        contact.setCity(scanner.nextLine());

        System.out.print("Enter State: ");
        contact.setState(scanner.nextLine());

        System.out.print("Enter Zip: ");
        contact.setZip(scanner.nextLine());

        System.out.print("Enter Phone Number: ");
        contact.setPhoneNumber(scanner.nextLine());

        System.out.print("Enter Email: ");
        contact.setEmail(scanner.nextLine());

        return contact;
    }
}
