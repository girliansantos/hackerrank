import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int indexBlankSpace = s.indexOf(" ");
        String text = s.substring(0,indexBlankSpace);
        String number = s.substring(indexBlankSpace+1, s.length());
        if(number.length() < 3){
            int left = 3 - number.length();
            for(int i = 1; i <= left; i++){
                number = "0"+number;
            }
        }
        int spaces = 15 - text.length();
        System.out.print(text);
        for(int i = 1; i <= spaces; i++){
            System.out.print(" ");
        }
        System.out.print(number);
    }
}
