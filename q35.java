// // Name-Aashi Sarbhai
// // Enrollment No-09350402022 
// //Question 35-Write a java program, implement multiple inheritance create two 
// //interfaces (IP and Forgein_Collaborations)[add required fields and methods in 
// //it] Implement both the interfaces in Student class. Implement only 
// //Foreign_Collaborations in WorkingProfessionals. 

// interface ip{ 
//     void publishpaper(); 
//     void  writecode(); 
// } 
// interface Forgein_Collaboration{ 
//     void participate(); 
//     void study(); 
// } 
// class Student implements ip, Forgein_Collaboration{ 
//     public void publishpaper(){ 
//         System.out.println("Student Publish Paper."); 
//     } 
//     public void writecode(){ 
//         System.out.println("Student Write Code."); 
//     } 
//     public void participate(){ 
//         System.out.println("Student  Participate in Foreign Collaboration."); 
//     } 
//     public void study(){ 
//         System.out.println("Student Study."); 
//     } 
// } 
 
// class WorkingProfessional implements Forgein_Collaboration{ 
//     public void participate(){ 
//         System.out.println("Employee  Participate in Foreign Collaboration."); 
//     } 
//     public void study(){ 
//         System.out.println("Working Professional Study."); 
//     } 
// } 
 
// public class q35{ 
//     public static void main(String[] args) { 
//         Student st = new Student(); 
//         WorkingProfessional wp = new WorkingProfessional(); 
         
//         st.publishpaper(); 
//         st.writecode(); 
//         st.participate(); 
//         st.study(); 
 
//         wp.participate(); 
//         wp.study(); 
//     } 
// } 