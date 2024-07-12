//Name-Aashi Sarbhai
//Enrollment No.-09350402022
//Question 29-Use code written in Q26. Display data of 3 different person. [Use Reference datatype array] 

import java.util.Scanner;

class Person {
    private String name;
    private char gender;
    private String address;
    private String contactNo;

    public void accept() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter gender (M/F): ");
        gender = scanner.next().charAt(0);

        System.out.print("Enter address: ");
        scanner.nextLine(); // Consume newline
        address = scanner.nextLine();

        System.out.print("Enter contact no.: ");
        contactNo = scanner.nextLine();

        scanner.close();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact No.: " + contactNo);
    }
}

public class q29 {
    public static void main(String[] args) {
        Person[] persons = new Person[3]; // Array of Person references

        System.out.println("Enter details of 3 persons:");

        // Accept details for each person
        for (int i = 0; i < 3; i++) {
            System.out.println("Details of Person " + (i + 1) + ":");
            persons[i] = new Person(); // Initialize each element of array
            persons[i].accept(); // Call accept method for each person
        }

        System.out.println("\nDetails of 3 persons:");
        
        // Display details of each person
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i].display(); // Call display method for each person
            System.out.println(); // Add a new line for better readability
        }
    }
}
