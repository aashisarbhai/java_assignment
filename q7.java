//Name- Aashi Sarbhai
//Enrollment number- 09350402022
//Question 7- Write a Java program to pass command line argument and display it on the screen? 

public class q7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments provided.");
        } else {
            System.out.println("Command line arguments provided:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}

