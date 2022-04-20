import java.util.ArrayList;
import java.util.Scanner;

public class Looping_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=q; i++){
            s = scanner.nextLine();
            list.add(s);
        }
        for(String item: list) {
            String[] values = item.split(" ");
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int n = Integer.parseInt(values[2]);
            printQuery(a, b, n);
        }
    }

    public static void printQuery(int a, int b, int n){
        int indice = a + 1*b;
        int quoc = 2;
        System.out.print(indice+" ");
        for(int i = 1; i < n; i++){
            indice += b*quoc;
            quoc = quoc*2;
            System.out.print(indice+" ");
        }
        System.out.println("");
    }
}
