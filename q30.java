//Name-Aashi Sarbhai
//Enrollment No.-09350402022
//Question 30- Write a java program to convert primitive data type variable into equivalent 
//wrapper class and vice versa. 

public class q30 {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt);

        double primitiveDouble = 20.5;
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf(primitiveChar);

        Integer wrapperInt2 = Integer.valueOf(30);
        int primitiveInt2 = wrapperInt2.intValue();

        Double wrapperDouble2 = Double.valueOf(40.5);
        double primitiveDouble2 = wrapperDouble2.doubleValue();

        Character wrapperChar2 = Character.valueOf('B');
        char primitiveChar2 = wrapperChar2.charValue();

        System.out.println("Primitive to Wrapper:");
        System.out.println("Primitive int: " + primitiveInt + ", Wrapper Integer: " + wrapperInt);
        System.out.println("Primitive double: " + primitiveDouble + ", Wrapper Double: " + wrapperDouble);
        System.out.println("Primitive char: " + primitiveChar + ", Wrapper Character: " + wrapperChar);

        System.out.println("\nWrapper to Primitive:");
        System.out.println("Wrapper Integer: " + wrapperInt2 + ", Primitive int: " + primitiveInt2);
        System.out.println("Wrapper Double: " + wrapperDouble2 + ", Primitive double: " + primitiveDouble2);
        System.out.println("Wrapper Character: " + wrapperChar2 + ", Primitive char: " + primitiveChar2);
    }
}
