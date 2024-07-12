// Name-Aashi Sarbhai
// Enrollment No-09350402022 
//Question 15-Write a java program to create output like: 
// * 
// ** 
// *** 
// ****  
// *****  
// ******  
// *******  
public class q15 { 
    public static void main(String[] args) { 
        for (int i = 0; i < 7; i++) { 
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
            System.out.println(); 
        } 
    } 
} 