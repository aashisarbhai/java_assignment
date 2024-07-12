// Name-Aashi Sarbhai
// Enrollment No-09350402022 
//Question 17-Write a java program to check input no is part of Fibonacci series or not?
import java.util.Scanner; 
 
public class q17 { 
    public static void main(String[] args) { 
        int n1=0; 
        int n2=1; 
        System.out.println("Enter the Number"); 
        int n3; 
        Scanner s= new Scanner(System.in); 
        n3 = s.nextInt(); 
        if(n3==0 || n3==1){ 
            System.out.println(n3+" Is a part of fibbonacci Series"); 
        } 
        while(n1 < n3){ 
            int n4 = n1+n2; 
            n1=n2; 
            n2=n4; 
        } 
        if(n1 == n3){ 
            System.out.println(n3+" Is a part of Fibonacci series."); 
        } 
        else{ 
            System.out.println(n3+" Is not a part of Fibonacci series."); 
        } 
        s.close();
    } 
}