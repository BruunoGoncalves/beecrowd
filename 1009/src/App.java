import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double sFixo = sc.nextDouble();
        double tVendas = sc.nextDouble();

        double total = (0.15 * tVendas) + sFixo;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}
