import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, n, raio;

        n = 3.14159;

        raio = sc.nextDouble();

        area = n * raio * raio;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
