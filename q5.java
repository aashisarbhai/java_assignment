//Enrollment Number:09350402025
//Name:Aashi Sarbhai
//Question 5:5.	Use code written in Q4,  try to invoke overloaded  main(), 
// in the main method, from where program execution started? 
public class q5 {
    public static void main(String[] args) {
        System.out.println("Inside public static void main (String args[])");
        main();
        main(5);
    }

    public static void main() {
        System.out.println("Inside public static void main()");
    }

    public static void main(int x) {
        System.out.println("Inside public static void main (int x)");
        System.out.println("value of x is:" +x);
    }
}

