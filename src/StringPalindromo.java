import java.util.Scanner;

public class StringPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        String reverse = "";
        for(int i = s.length()-1; i>=0; i--){
            reverse = reverse+s.charAt(i);
        }
        if(reverse.compareTo(s) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }    
}