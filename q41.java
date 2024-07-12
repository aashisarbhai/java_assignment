// // Name-Aashi Sarbhai
// // Enrollment No-09350402022 
// //Question 41-Please convert checked exception of q40 into unchecked exception. 

// import java.util.Scanner; 
 
// class PercentageOutOfRangeException extends RuntimeException { 
//     public PercentageOutOfRangeException(String message) { 
//         super(message); 
//     } 
// } 
 
// public class q41 { 
//     public static void main(String[] args) { 
//         Scanner scanner = new Scanner(System.in); 
//         // Accepting student details 
//         System.out.println("Enter First Name:"); 
//         String firstName = scanner.nextLine(); 
//         System.out.println("Enter Last Name:"); 
//         String lastName = scanner.nextLine(); 
//         System.out.println("Enter Qualification:"); 
//         String qualification = scanner.nextLine(); 
//         System.out.println("Enter Total Marks:"); 
//         int totalMarks = scanner.nextInt(); 
//         System.out.println("Enter Percentage:"); 
//         double percentage = scanner.nextDouble(); 
//         if (percentage <= 0 || percentage > 100) { 
//             throw new PercentageOutOfRangeException("Percentage is out of range"); 
//          } 
//         // Displaying student details 
//         System.out.println("\nStudent Details:"); 
//         System.out.println("First Name: " + firstName); 
//         System.out.println("Last Name: " + lastName); 
//         System.out.println("Qualification: " + qualification); 
//         System.out.println("Percentage: " + percentage); 
//         System.out.println("Total Marks: " + totalMarks); 
//         scanner.close(); 
//     } 
// }