// // Name-Aashi Sarbhai 
// // Enrollment No-09350402022
// //Question 39-Handle ArithematicException in q25, where it is required.

// import java.util.Scanner; 
 
// class Arithmetic { 
//     int num1, num2; 
 
//     public void geter() { 
//         Scanner scan = new Scanner(System.in); 
//         System.out.println("Enter first NUmber :"); 
//         num1 = scan.nextInt(); 
//         System.out.println("Enter Second NUmber :"); 
//         num2 = scan.nextInt(); 
//     } 
 
//     public void add() { 
//         System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2)); 
//     } 
 
//     public void sub() { 
//         System.out.println("Subtraction of " + num1 + " and " + num2 + " is " 
// + 
//                 (num1 - num2)); 
//     } 
 
//     public void mul() { 
//         System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + 
//                 (num1 * num2)); 
//     } 
 
//     public void div() { 
//         System.out.println("Division of " + num1 + " and " + num2 + " is " + 
// (num1 
//                 / num2)); 
//     } 
 
//     public void mod() { 
//         System.out.println("Modulus of " + num1 + " and " + num2 + " is " + 
// (num1 % num2)); 
//     } 
// } 
 
// public class q39 { 
//     public static void main(String[] args) { 
//         Arithmetic obj = new Arithmetic(); 
//         try { 
//             obj.geter(); 
//             obj.add(); 
//             obj.sub(); 
//             obj.mod(); 
//             obj.mul(); 
//             obj.div(); 
//         } catch (ArithmeticException e) { 
//             System.out.println("Error: ArithematicException"); 
//         } 
//     } 
// }