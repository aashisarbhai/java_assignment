//Name-Aashi Sarbhai
//Enrollment No.-09350402022
//Question 36-Create a class called MyString : Declare two string type variables: str1 (“ Welcome to Java tutorial”)  and str2(“Todays topic is String Handling in Java”). Perform following operations in this class: [CO1]
// a.	Concatenate two strings
// b.	Covert str1 into lower case
// c.	Covert str2 into upper case
// d.	Are both equal to each other
// e.	Show the location of “J” in  both str1 and str2
// f.	Replace “i” with “I” in both the strings
// g.	display “java” from str string
// h.	Display the 7th character in str1.                                   
// i.	Convert str1 into string array   

public class q36 {
    public static void main(String[] args) {
        String str1 = "Welcome to Java tutorial";
        String str2 = "Todays topic is String Handling in Java";

        // a. Concatenate two strings
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // b. Convert str1 into lower case
        String lowerCaseStr1 = str1.toLowerCase();
        System.out.println("Lower case str1: " + lowerCaseStr1);

        // c. Convert str2 into upper case
        String upperCaseStr2 = str2.toUpperCase();
        System.out.println("Upper case str2: " + upperCaseStr2);

        // d. Are both equal to each other
        boolean areEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + areEqual);

        // e. Show the location of "J" in both str1 and str2
        int locationInStr1 = str1.indexOf('J');
        int locationInStr2 = str2.indexOf('J');
        System.out.println("Location of 'J' in str1: " + locationInStr1);
        System.out.println("Location of 'J' in str2: " + locationInStr2);

        // f. Replace "i" with "I" in both the strings
        String replacedStr1 = str1.replace('i', 'I');
        String replacedStr2 = str2.replace('i', 'I');
        System.out.println("str1 after replacing 'i' with 'I': " + replacedStr1);
        System.out.println("str2 after replacing 'i' with 'I': " + replacedStr2);

        // g. Display "java" from str string
        String str = "Java is a programming language";
        String javaSubstring = str.substring(0, 4).toLowerCase();
        System.out.println("Substring 'java': " + javaSubstring);

        // h. Display the 7th character in str1
        char seventhChar = str1.charAt(6);
        System.out.println("7th character in str1: " + seventhChar);

        // i. Convert str1 into string array
        String[] strArray = str1.split(" ");
        System.out.println("String array from str1:");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
