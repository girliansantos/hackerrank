import java.util.ArrayList;
import java.util.Scanner;

public class DataType {
    // byte -128, 127
    // short -32768, 32767
    // int -2^31, 2^31 - 1
    // long -2^63, 2^63-1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            s = scanner.nextLine();
            list.add(s);
        }
        for (String item:list) {
            try{
                Long x = Long.parseLong(item);
                print(Long.parseLong(item));
            }catch (NumberFormatException e){
                System.out.println(item+" can't be fitted anywhere.");
            }
        }
    }

    public static void print(Long n){
        System.out.println(n+ " can be fitted in:");
        if(n >= -128 && n <= 127)
            System.out.println("* byte");
        if(n >= -32768 && n <= 32767)
            System.out.println("* short");
        if(n >= -Math.pow(2,31) && n <= Math.pow(2,31)-1)
            System.out.println("* int");
        if(n >= -Math.pow(2,63) && n <= Math.pow(2,63)-1)
            System.out.println("* long");
    }
}
