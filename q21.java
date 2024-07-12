// Name-Aashi Sarbhai 
// Enrollment No-09350402022
//Question 21-Write java program to accept 10 integer values from user, store them in 
//array, arrange the array in ascending and descending order.

import java.util.Scanner; 
import java.util.Arrays; 
 
public class q21 { 
    public static void main(String[] args) { 
        Scanner Scan = new Scanner(System.in); 
        int[] arr = new int[10]; 
        System.out.println("Enter 10 element : "); 
        for (int i = 0; i < 10; i++) 
            arr[i] = Scan.nextInt(); 
        Arrays.sort(arr); 
        int j = 10; 
        System.out.println("array in ascending order Descending order : "); 
        for (int i = 0; i < 10 && j >= 0; i++) { 
            System.out.print(arr[i] + " " + arr[--j]); 
            System.out.println(); 
        } 
        Scan.close(); 
    } 
} 
