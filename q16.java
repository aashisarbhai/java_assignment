//Name-Aashi Sarbhai
//Enrollment No-09350402022 
//Question 16- Write a java program to display grade of students depends on marks. 
//100-80 [A],79-60[B],59-40[C], <40 [F]?  

import java.util.Scanner; 
 
public class q16 { 
    public static void main(String[] args) { 
        int marks; 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter Marks:"); 
        marks = s.nextInt(); 
        if(marks<=100 && marks>=80){ 
            System.out.println("A Grade"); 
        } 
        else if(marks<80 && marks>=60){ 
            System.out.println("B Grade"); 
        } 
        else if (marks<60 && marks>=40) { 
            System.out.println("C Grade"); 
        } 
        else{ 
            System.out.println("F Grade"); 
        }
        s.close(); 
    } 
}