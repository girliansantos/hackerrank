import java.util.ArrayList;
import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        ArrayList<String[]> list = new ArrayList<>();
        list.add(getText(s1));
        list.add(getText(s2));
        list.add(getText(s3));
        System.out.println("================================");
        for(int i = 0; i < list.size(); i++){
            int lefts = 15 - list.get(i)[0].length();
            System.out.print(list.get(i)[0]);
            for(int j=1; j<=lefts; j++){
                System.out.print(" ");
            }
            System.out.print(list.get(i)[1]);
            System.out.print("\n");
        }
        System.out.println("================================");
    }

    public static String[] getText(String s){
        int indexBlank = s.indexOf(" ");
        String[] values = new String[2];
        String text = s.substring(0, indexBlank);
        String number = s.substring(indexBlank+1, s.length());
        if(number.length() <3){
            int left = 3 - number.length();
            for(int i = 1; i<=left; i++){
                number = "0"+number;
            }
        }
        values[0] = text;
        values[1] = number;
        return values;
    }
}
