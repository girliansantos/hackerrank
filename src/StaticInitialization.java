import java.util.Scanner;

public class StaticInitialization {
    static boolean flag;
    static int B;
    static int H;

    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        scanner.nextLine();
        H = scanner.nextInt();
        flag=true;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
