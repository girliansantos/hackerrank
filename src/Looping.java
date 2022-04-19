import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for(int i=1; i<= 10; i++){
            result = n * i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
}
