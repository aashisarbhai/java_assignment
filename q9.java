//Name- Aashi Sarbhai
//Enrollment Number-09350402022
//Question 9-Write a java program, accept following details from student: 
//First name, last name, qualification, percentage,  total marks.

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Qualification: ");
        String qualification = scanner.nextLine();
        
        System.out.print("Percentage: ");
        double percentage = scanner.nextDouble();
        
        System.out.print("Total Marks: ");
        int totalMarks = scanner.nextInt();

        System.out.println("\nStudent Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Percentage: " + percentage);
        System.out.println("Total Marks: " + totalMarks);

        scanner.close();
    }
}
