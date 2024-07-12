//Name-Aashi Sarbhai
//Enrollment No.-09350402022
//Question 25-Write a java programs to perform, Use classes and methods performs ( +,-,*,/,%). On instance 
//variable dynamically accepted from user at runtime (Use Scanner Class to accept variable values).  

import java.util.Scanner;

class Calculator {
    private double num1;
    private double num2;

    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Not a Number
        } else {
            return num1 / num2;
        }
    }

    public double modulus() {
        if (num2 == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Not a Number
        } else {
            return num1 % num2;
        }
    }
}

public class q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        calculator.setNumbers(num1, num2);

        System.out.println("Result of addition: " + calculator.add());
        System.out.println("Result of subtraction: " + calculator.subtract());
        System.out.println("Result of multiplication: " + calculator.multiply());
        System.out.println("Result of division: " + calculator.divide());
        System.out.println("Result of modulus: " + calculator.modulus());

        scanner.close();
    }
}
