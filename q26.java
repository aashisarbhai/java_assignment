//Name-Aashi Sarbhai
//Enrollment no.-09350402022
//Question 26-Write a java program create class Person, use methods accept() [For accepting details] & 
//display() [For displaying details]. Use main as starting point and call both the method.
// Accept following details: Name, Gender, Address, Contact no.  


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

public class q26 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Enter person details:");
        person.accept();
        System.out.println("\nPerson details:");
        person.display();
    }
}
