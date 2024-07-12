 // Name-Aashi Sarbhai
// Enrollment No-09350402022 
//Question 23-print only either Odd or Even s from array?  
 
public class q23 { 
    public static void main(String[] args) { 
        int[] arr = { 1, 3, 4, 1, 4, 5 }; 
        System.out.println("odd even"); 
        for (int i = 0; i < arr.length; i += 2) { 
            System.out.print(arr[i]); 
            if (i + 1 != arr.length) 
                System.out.println(" " + arr[i + 1]); 
        } 
    } 
} 
