import java.util.ArrayList;
import java.util.Scanner;

public class EndOfFileChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(scanner.hasNext()){
            list.add(scanner.nextLine());
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(i+1+" "+list.get(i));
        }
    }
}
