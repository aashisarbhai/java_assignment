// // Name-Aashi Sarbhai
// // Enrollment No-09350402022
// //Question 33-Use code written in Q31, make HumanBeing Class immutable and note 
// //down the output.   
// import java.util.Scanner; 
 
// abstract class HumanBeing { 
//     String name; 
//     String address; 
 
//     public HumanBeing(String name, String address) { 
//         this.name = name; 
//         this.address = address; 
//     } 
 
//     public final void accept() { 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.print("Enter Name: "); 
//         this.name = scanner.nextLine(); 
//         System.out.print("Enter Address: "); 
//         this.address = scanner.nextLine(); 
//     } 
 
//     public void display() { 
//         System.out.println("Name: " + name); 
//         System.out.println("Address: " + address); 
//     } 
// } 
 
// class Student extends HumanBeing { 
//     String rollNo; 
//     double percentage; 
//     String graduationStream; 
 
//     public Student(String name, String address) { 
//         super(name, address); 
//     } 
 
//     public void accept() { 
//         super.accept(); 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.print("Enter Roll No: "); 
//         this.rollNo = scanner.nextLine(); 
//         System.out.print("Enter Percentage: "); 
//         this.percentage = scanner.nextDouble(); 
//         scanner.nextLine(); // consume newline 
//         System.out.print("Enter Graduation Stream: "); 
//         this.graduationStream = scanner.nextLine(); 
//     } 
 
//     public void display() { 
//         super.display(); 
//         System.out.println("Roll No: " + rollNo); 
//         System.out.println("Percentage: " + percentage); 
//         System.out.println("Graduation Stream: " + graduationStream); 
//     } 
// } 
 
// class WorkingProfessional extends HumanBeing { 
//     String department; 
//     String designation; 
 
//     public WorkingProfessional(String name, String address) { 
//         super(name, address); 
//     } 
 
//     public void accept() { 
//         super.accept(); 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.print("Enter Department: "); 
//         this.department = scanner.nextLine(); 
//         System.out.print("Enter Designation: "); 
//         this.designation = scanner.nextLine(); 
//     } 
 
//     public void display() { 
//         super.display(); 
//         System.out.println("Department: " + department); 
//         System.out.println("Designation: " + designation); 
//     } 
// } 
 
// public class q33 { 
//     public static void main(String[] args) { 
//         Student student = new Student("John Doe", "123 Main St"); 
//         student.accept(); 
//         student.display(); 
 
//         System.out.println(); 
 
//         WorkingProfessional professional = new WorkingProfessional("Jane Smith", "456 Elm St"); 
//         professional.accept(); 
//         professional.display(); 
//     } 
// }