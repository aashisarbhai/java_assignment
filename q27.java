//Name-Aashi Sarbhai
//Enrollment No.-09350402022
//Question 27-Write a java program to calculate average of numbers passed as an argument. 
//User is free to pass any or zero number of arguments. (Note: Overloading not allowed/ Use varargs.)

public class q27 {

    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers provided.");
            return 0;
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("Average: " + calculateAverage(1, 2, 3, 4, 5));
        System.out.println("Average: " + calculateAverage(10, 20, 30));
        System.out.println("Average: " + calculateAverage(2.5, 3.5, 4.5));
        System.out.println("Average: " + calculateAverage());
    }
}
