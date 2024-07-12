// // Name-Aashi Sarbhai
// // Enrollment No-09350402022
// // Question 43-.In extension to Q31, Accept one more detail from student, “EmailID”. 
// //Raise  an exception  if email Id entered by user does  not contain ‘@’ character. 
// //Handle the exception in an appropriate manner. 
// import java.util.Scanner; 
 
// class HumanBeing { 
//     String name; 
//     String address; 
 
//     public HumanBeing() { 
//     } 
 
//     public HumanBeing(String name, String address) { 
//         this.name = name; 
//         this.address = address; 
//     } 
 
//     public void accept() { 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.println("Enter name:"); 
//         name = scanner.nextLine(); 
//         System.out.println("Enter address:"); 
//         address = scanner.nextLine(); 
//     } 
 
//     public void display() { 
//         System.out.println("Name: " + name); 
//         System.out.println("Address: " + address); 
//     } 
// } 
 
// class Student extends HumanBeing { 
//     int rollNo; 
//     double percentage; 
//     String graduationStream; 
//     String emailId; 
 
//     public Student() { 
//     } 
 
//     public Student(String name, String address, int rollNo, double percentage, 
//             String graduationStream, String emailId) { 
//         super(name, address); 
//         this.rollNo = rollNo; 
//         this.percentage = percentage; 
//         this.graduationStream = graduationStream; 
//         this.emailId = emailId; 
//     } 
 
//     @Override 
//     public void accept() { 
//         super.accept(); 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.println("Enter roll number:"); 
//         rollNo = scanner.nextInt(); 
//         System.out.println("Enter percentage:"); 
//         percentage = scanner.nextDouble(); 
//         scanner.nextLine(); // Consume newline 
//         System.out.println("Enter graduation stream:"); 
//         graduationStream = scanner.nextLine(); 
//         boolean validEmail = false; 
//         while (!validEmail) { 
//             System.out.println("Enter email ID:"); 
//             emailId = scanner.nextLine(); 
//             try { 
//                 validateEmail(emailId); 
//                 validEmail = true; 
//             } catch (InvalidEmailException e) { 
//                 System.out.println(e.getMessage()); 
//             } 
//         } 
//     } 
 
//     @Override 
//     public void display() { 
//         super.display(); 
//         System.out.println("Roll Number: " + rollNo); 
//         System.out.println("Percentage: " + percentage); 
//         System.out.println("Graduation Stream: " + graduationStream); 
//         System.out.println("Email ID: " + emailId); 
//     } 
 
//  private void validateEmail(String email) throws InvalidEmailException { 
//  if (!email.contains("@")) { 
//  throw new InvalidEmailException("Email ID must contain '@'  character."); 
//  } 
//  } 
// } 
 
// class WorkingProfessional extends HumanBeing { 
//     String department; 
//     String designation; 
 
//     public WorkingProfessional() { 
//     } 
 
//     public WorkingProfessional(String name, String address, String department, 
//             String designation) { 
//         super(name, address); 
//         this.department = department; 
//         this.designation = designation; 
//     } 
 
//     @Override 
//     public void accept() { 
//         super.accept(); 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.println("Enter department:"); 
//         department = scanner.nextLine(); 
//         System.out.println("Enter designation:"); 
//         designation = scanner.nextLine(); 
//     } 
 
//     @Override 
//     public void display() { 
//         super.display(); 
//         System.out.println("Department: " + department); 
//         System.out.println("Designation: " + designation); 
//     } 
// } 
 
// class InvalidEmailException extends RuntimeException { 
//     public InvalidEmailException(String message) { 
//         super(message); 
//     } 
// } 
 
// public class q43 { 
//     public static void main(String[] args) { 
//         Student student = new Student(); 
//         System.out.println("Enter student details:"); 
//         student.accept(); 
//         student.display(); 
//         WorkingProfessional professional = new WorkingProfessional(); 
//         System.out.println("\nEnter working professional details:"); 
//         professional.accept(); 
//         professional.display(); 
// } 
// }