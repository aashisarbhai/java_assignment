// Name-Aashi Sarbhai 
// Enrollment No-09350402022 
//Question 22- Print the Maximum, minimum and average from array?
 
public class q22 { 
    public static void main(String[] args) { 
        int[] arr = { 1, 3, 4, 1, 4, 5 }; 
        int sum = 0; 
        int max = arr[0], min = arr[0]; 
        for (int i = 0; i < arr.length; i++) { 
            if (max < arr[i]) 
                max = arr[i]; 
            if (min > arr[i]) 
                min = arr[i]; 
            sum += arr[i]; 
        } 
        System.out.println("Maximum value: " + max); 
        System.out.println("Minimum value: " + min); 
        System.out.println("Average value: " + (sum / arr.length)); 
    } 
} 
