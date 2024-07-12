// // Name-Aashi Sarbhai
// // Enrollment No-09350402022 
// //Question 32-Try to apply overriding rules in Q31 

// import java.util.Scanner; 
 
// class HumanBeing { 
//     String name; 
//     String address; 
 
//     public HumanBeing(String name, String address) { 
//         this.name = name; 
//         this.address = address; 
//     } 
 
//     public void accept() { 
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
 
//     @Override 
//     public void accept() { 
//         super.accept(); 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.print("Enter Roll No: "); 
//         this.rollNo = scanner.nextLine(); 
//         System.out.print("Enter Percentage: "); 
//         this.percentage = scanner.nextDouble(); 
//         scanner.nextLine(); 
//         System.out.print("Enter Graduation Stream: "); 
//         this.graduationStream = scanner.nextLine(); 
//     } 
 
//     @Override 
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
 
//     @Override 
//     public void accept() { 
//         super.accept(); 
//         Scanner scanner = new Scanner(System.in); 
//         System.out.print("Enter Department: "); 
//         this.department = scanner.nextLine(); 
//         System.out.print("Enter Designation: "); 
//         this.designation = scanner.nextLine(); 
//     } 
 
//     @Override 
//     public void display() { 
//         super.display(); 
//         System.out.println("Department: " + department); 
//         System.out.println("Designation: " + designation); 
//     } 
// } 
 
// public class q32 { 
//     public static void main(String[] args) { 
//         Student student = new Student("Aashi Sarbhai", "Rohini"); 
//         student.accept(); 
//         student.display(); 
 
//         System.out.println(); 
 
// WorkingProfessional professional = new WorkingProfessional("Jane Smith", "456 Elm St"); 
// professional.accept(); 
// professional.display(); 
// } 
// }