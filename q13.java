//Name-Aashi Sarbhai
//Enrollment No.-09350402022
//Question 13-Write  java program to print table from 0 to accepted number, using loops and keyboard inputs. 

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i <= number; i++) {
            System.out.println("Table for " + i + ":");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

        scanner.close();
    }
}
