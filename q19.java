// Name- Aashi Sarbhai
// Enrollment No-09350402022 
//Question 19-Write java program to calculate factorial of accepted number?
import java.util.Scanner; 
 
public class q19 { 
    public static void main(String[] args) { 
        int a, fact = 1; 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter Number:"); 
        a = s.nextInt(); 
        if (a < 0) { 
            System.out.println("Factorial is not possible for negative numbers."); 
        } else if (a == 0) { 
            System.out.println("Factorial of 0 is 1"); 
        } else { 
            for (int i = 1; i <= a; i++) { 
                fact *= i; 
            } 
            System.out.println("Factorial of " + a + " is: " + fact); 
        } 
        s.close();
    } 
} 