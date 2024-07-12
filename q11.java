//Name-Aashi Sarbhai
//Enrollment No.-09350402022
//Question 11-Write a java program to check entered number is “even ” or
// “odd”display message accordingly ? 

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }
}
