package task5;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Phone Book Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. View all contacts");
            System.out.println("3. Update a contact");
            System.out.println("4. Search for a contact by phone number");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addContact(phoneBook, scanner);
                    break;
                case "2":
                    viewContacts(phoneBook);
                    break;
                case "3":
                    updateContact(phoneBook, scanner);
                    break;
                case "4":
                    searchContact(phoneBook, scanner);
                    break;
                case "5":
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addContact(HashMap<String, String> phoneBook, Scanner scanner) {
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(phoneNumber)) {
            System.out.println("Contact with this phone number already exists!");
        } else {
            phoneBook.put(phoneNumber, name);
            System.out.println("Contact added successfully.");
        }
    }

    private static void viewContacts(HashMap<String, String> phoneBook) {
        if (phoneBook.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            System.out.println("Contacts:");
            for (var entry : phoneBook.entrySet()) {
                System.out.println("Phone: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }

    private static void updateContact(HashMap<String, String> phoneBook, Scanner scanner) {
        System.out.print("Enter the phone number of the contact to update: ");
        String phoneNumber = scanner.nextLine();

        if (phoneBook.containsKey(phoneNumber)) {
            System.out.print("Enter the new name: ");
            String newName = scanner.nextLine();
            phoneBook.put(phoneNumber, newName);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact with this phone number does not exist.");
        }
    }

    private static void searchContact(HashMap<String, String> phoneBook, Scanner scanner) {
        System.out.print("Enter the name to search: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (HashMap.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(name)) {
                System.out.println("Phone: " + entry.getKey() + ", Name: " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact with this name not found.");
        }
    }

}
