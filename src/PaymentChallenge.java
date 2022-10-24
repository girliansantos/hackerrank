
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class PaymentChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nnumero: ");
        String number = scanner.nextLine();
        scanner.close();
        double payment = Double.parseDouble(number);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = nf.format(payment);

        nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);

        System.out.println(us);
        System.out.println(india);
        System.out.println(china);
        System.out.println(france);
    }    
}