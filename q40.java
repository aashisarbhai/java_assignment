// Name-Aashi Sarbhai
// Enrollment No-09350402022
//Question 40- In extension of Q9 of this file, please raise a user defined checked 
//Exception, if percentage is less than 0 or more than 100.  
import java.util.Scanner; 
 
class customExceptions extends Exception { 
    public customExceptions(String err) { 
        super(err); 
    } 
} 
 
public class q40 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        // Accepting student details 
        System.out.println("Enter First Name:"); 
        String firstName = scanner.nextLine(); 
        System.out.println("Enter Last Name:"); 
        String lastName = scanner.nextLine(); 
        System.out.println("Enter Qualification:"); 
        String qualification = scanner.nextLine(); 
        System.out.println("Enter Total Marks:"); 
        int totalMarks = scanner.nextInt(); 
        System.out.println("Enter Percentage:"); 
        double percentage = scanner.nextDouble(); 
        try { 
            if (percentage <= 0 || percentage > 100) { 
                percentage = 0; 
                scanner.close(); 
                throw new customExceptions("Percentage is out of Range"); 
            } 
        } catch (customExceptions e) { 
            System.out.println("Error:" + e.getMessage()); 
            System.exit(0); 
        } finally { 
            scanner.close(); 
        } 
        // Displaying student details 
        System.out.println("\nStudent Details:"); 
        System.out.println("First Name: " + firstName); 
        System.out.println("Last Name: " + lastName); 
        System.out.println("Qualification: " + qualification); 
        System.out.println("Percentage: " + percentage); 
        System.out.println("Total Marks: " + totalMarks); 
    } 
}