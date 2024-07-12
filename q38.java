// Name-Aashi Sarbhai
// Enrollment No-09350402022 
//Question 38-Handle ArrayIndexOutOfBoundsException in Q21-Q23.  

import java.util.Scanner; 
import java.util.Arrays; 
 
public class q38 { 
    // Q21 
    public static void arrangeInAscendingAndDescending() { 
        Scanner Scan = new Scanner(System.in); 
        int[] arr = new int[10]; 
        System.out.println("Enter 10 element : "); 
        for (int i = 0; i < 10; i++) 
            arr[i] = Scan.nextInt(); 
        Arrays.sort(arr); 
        int j = 10; 
        System.out.println("array in ascending order Descending order : "); 
        for (int i = 0; i < 12 && j >= 0; i++) { 
            System.out.print(arr[i] + " " + arr[--j]); 
            System.out.println(); 
        } 
        Scan.close(); 
    } 
 
    // Q22 
    public static void maxAndmin(int[] arr) { 
        int sum = 0; 
        int max = arr[0], min = arr[0]; 
        for (int i = 0; i < arr.length; i++) { 
            if (max < arr[i]) 
                max = arr[i]; 
            if (min > arr[i]) 
                min = arr[i]; 
            sum += arr[i]; 
        } 
        System.out.println("Maximum value: " + max); 
        System.out.println("Minimum value: " + min); 
        System.out.println("Average value: " + (sum / arr.length)); 
    } 
 
    // Q23 
    public static void printOddAndEven(int[] arr) { 
        System.out.println("odd even"); 
        for (int i = 0; i < arr.length; i += 2) { 
            System.out.print(arr[i]); 
            if (i + 1 != arr.length) 
                System.out.println(" " + arr[i + 1]); 
        } 
    } 
 
 public static void main(String[] args) { 
 int[] arr = { 1, 3, 4, 1, 4, 5 }; 
 try { 
 arrangeInAscendingAndDescending(); 
 System.out.println("maximum and minimum value in array { 1, 3, 4, 1, 4, 5 }: "); 
 maxAndmin(arr); 
 System.out.println("odd and even value in array { 1, 3, 4, 1, 4, 5 }:  "); 
 printOddAndEven(arr); 
 }catch( 
 
    ArrayIndexOutOfBoundsException e) 
    { 
        System.out.println("Error: Index out of bounds. "); 
    } 
}}