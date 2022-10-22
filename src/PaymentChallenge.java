
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class PaymentChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nnumero: ");
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setCurrency(Currency.getInstance(Locale.US));
        String us = nf.format(payment);
        nf.setCurrency(Currency.getInstance(new Locale("hi", "in")));
        String india = nf.format(payment);
        System.out.println(india);
    }    
}