import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        char[] char_a = a.toLowerCase().toCharArray();
        char[] char_b = b.toLowerCase().toCharArray();

        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
        }else{
            Arrays.sort(char_a);
            Arrays.sort(char_b);
            if(Arrays.equals(char_a, char_b)){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not Anagrams");
            }
        }
    }    
}