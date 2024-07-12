//Enrollment Number:09350402025
//Name:Aashi Sarbhai
//Question 4:Write a Java program to overload the main(), note down the signature  
//of main method, from where  program execution started.

public class q4 {
    public static void main(String[] args) {
        System.out.println("Inside public static void main (String args[])");
    }

    public static void main() {
        System.out.println("Inside public static void main()");
    }

    public static void main(int x) {
        System.out.println("Inside public static void main (int x)");
    }
}
