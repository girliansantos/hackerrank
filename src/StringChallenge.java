import java.util.Scanner;

public class StringChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        int size_strings = A.length() + B.length();
        int alfa = A.compareTo(B);
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(size_strings);        
        if(alfa < 0){
            System.out.println("No");
        }
        if(alfa == 0){
            System.out.println("No");
        }
        if(alfa > 0){
            System.out.println("Yes");
        }
        System.out.println(capitalizedA+" "+capitalizedB);
    }    
}