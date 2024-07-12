// Name-Aashi Sarbhai 
// Enrollment No-09350402022 
//Question 24- Redo Q15 and Q20 with help of variable length multidimensional 
//(Uneven/Irregular) Arrays. 
 
public class q24 { 
    public static void main(String[] args) { 
        String[][] p = { 
                { "* " }, 
                { "** " }, 
                { "*** " }, 
                { "**** " }, 
                { "*****" }, 
                { "**** " }, 
                { "*** " }, 
                { "** " }, 
                { "* " } 
        }; 
        String[][] p2 = { 
                { "* " }, 
                { "** " }, 
                { "*** " }, 
                { "**** " }, 
                { "*****" } 
        }; 
        for (String[] row : p) { 
            for (String symbol : row) { 
                System.out.print(symbol); 
            } 
            System.out.println(); 
        } 
        System.out.println(); 
        for (String[] row : p2) { 
            for (String symbol : row) { 
                System.out.print(symbol); 
            } 
            System.out.println(); 
        } 
    } 
} 

