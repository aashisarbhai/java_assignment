//Enrollment Number:09350402025
//Name:Aashi Sarbhai
//Question 6:Use code written in Ques 2, try to explicitly invoke  the main of second class from 
// 1st class main()?  Execute first Class through main method

// Main.java
import java.lang.reflect.Method;

public class q6 {
    public static void main(String[] args) {
        System.out.println("Main class main method executed.");
        
        // Invoke the main method of SecondClass
        try {
            Class<?> secondClass = Class.forName("SecondClass");
            Method mainMethod = secondClass.getMethod("main", String[].class);
            String[] arguments = {};
            mainMethod.invoke(null, (Object) arguments);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SecondClass {
    public static void main(String[] args) {
        System.out.println("SecondClass main method executed.");
    }
}
