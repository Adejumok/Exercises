package PhoneBook;

import java.util.Scanner;

public class PhoneBookMain {
    private static Scanner scanner=new Scanner(System.in);
    private static User user=new User();
    private static PhoneBookEntries phoneBookEntries=new PhoneBookEntries();
    private static AnEntry entry;
    private static String prompt;
    private static int response;

    public static void main(String[] args) {
        userLogin();

        boolean exit=false;
        while (!exit){
            System.out.println();
            phoneBookMenu();
            System.out.print("Kindly enter a number: ");
            response=scanner.nextInt();
            scanner.nextLine();

            switch (response){
                case 1->addEntry();
                case 2->editEntry();
                case 3->deleteEntry();
                case 4->printAnEntry();
                case 5->printAllEntries();
                case 6->exit=true;
            }
        }

    }

    private static void userLogin(){
        System.out.println("W E L C O M E!!!");
        System.out.println("Enter your Username: ");
        String userName=scanner.nextLine();
        user.setUserName(userName);
        System.out.println("You can now go on "+user.getUserName());
    }

    private static void printAllEntries() {
        phoneBookEntries.printOutEntries();
    }

    private static void printAnEntry() {
        System.out.println("Enter the name of the entry you want to view: ");
        String name=scanner.nextLine();
        System.out.println(phoneBookEntries.getEntry(name));
    }

    private static void deleteEntry() {
        System.out.println("Enter the name of the entry you want to delete: ");
        String name=scanner.nextLine();
        phoneBookEntries.deleteEntry(name);
    }

    private static void editEntry() {
        System.out.println("Enter the old name: ");
        String name=scanner.nextLine();

        System.out.println("Enter the new name: ");
        String newName=scanner.nextLine();
        phoneBookEntries.getEntry(name).setName(newName);
        name = newName;

        prompt= """
                What other thing would you like to edit?
                1. Edit Address
                2. Edit Telephone
                3. Edit Email
                """;

        System.out.println(prompt);
        System.out.print("Kindly enter a number: ");
        response=scanner.nextInt();
        scanner.nextLine();

        switch (response){
            case 1->{
                System.out.println("Enter the new address: ");
                String newAddress=scanner.nextLine();
                phoneBookEntries.getEntry(name).setAddress(newAddress);
            }

            case 2->{
                System.out.println("Enter the new telephone: ");
                String newTelephone=scanner.nextLine();
                phoneBookEntries.getEntry(name).setTelephone(newTelephone);
            }

            case 3->{
                System.out.println("Enter the new email: ");
                String newEmail=scanner.nextLine();
                phoneBookEntries.getEntry(name).setEmail(newEmail);
            }
        }

        System.out.println(phoneBookEntries.getEntry(name));
    }

    private static void addEntry() {
        System.out.println("Enter the name: ");
        String name=scanner.nextLine();
        System.out.println("Enter the address: ");
        String address=scanner.nextLine();
        System.out.println("Enter the telephone: ");
        String telephone=scanner.nextLine();
        System.out.println("Enter the email: ");
        String email=scanner.nextLine();
        entry=new AnEntry(name,address,telephone,email);
        phoneBookEntries.addEntry(entry);

    }

    private static void phoneBookMenu(){
        prompt= """
                  P H O N E  B O O K  M E N U
                *******************************
                1. Add an entry
                2. Edit an entry
                3. Delete an entry
                4. Print an entry
                5. Print all entries
                6. Exit
                """;
        System.out.println(prompt);
    }
}
