import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int p1, n1, p2, n2;
        double v1, v2, total;

        p1 = sc.nextInt();
        n1 = sc.nextInt();
        v1 = sc.nextDouble();

        p2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();

        total = (n1 * v1) + (n2 * v2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


        sc.close();
    }
}
