//Name-Aashi Sarbhai
//Enrollment no.-09350402022
//Question 28- Create a class, make instance variable and local variable with same name. 
//print value of both.

public class q28 {
    private int x;

    public q28(int x) {
        this.x = x; 
    }

    public void printValues() {
       
        int x = 100; 
        System.out.println("Value of instance variable x: " + this.x);
        System.out.println("Value of local variable x: " + x);
    }

    public static void main(String[] args) {
        q28 example = new q28(50);
        example.printValues();
    }
}
