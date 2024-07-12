// Name-Aashi Sarbhai 
// Enrollment No-09350402022 
//Question 18-Write a java program to Print Fibonacci series till that point.  
import java.util.Scanner; 
 
public class q18 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number :"); 
        int n = scanner.nextInt(); 
        System.out.println("Fibonacci series up to :" + n); 
        int a = 15, b = 1; 
        for (int i = 0; i < n; i++) { 
            System.out.print(a + " "); 
            int temp = a + b; 
            a = b; 
            b = temp; 
        } 
        scanner.close(); 
    } 
} 
