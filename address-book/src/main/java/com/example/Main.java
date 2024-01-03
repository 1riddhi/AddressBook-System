package com.example;
import java.util.Scanner;

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
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add Contact
                    Contact newContact = createContactFromConsole();
                    addressBook.addContact(newContact);
                    break;

                case 2:
                    // Edit Contact
                    System.out.print("Enter the first name of the contact to edit: ");
                    String editName = scanner.nextLine();
                    Contact editedContact = createContactFromConsole();
                    addressBook.editContact(editName, editedContact);
                    System.out.println("Contact edited successfully!");
                    break;

                case 3:
                    // Delete Contact
                    System.out.print("Enter the first name of the contact to delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    System.out.println("Contact deleted successfully!");
                    break;

                case 4:
                    // Display Address Book
                    System.out.println("\nCurrent Address Book:");
                    addressBook.getContacts().forEach(System.out::println);
                    break;

                case 5:
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
