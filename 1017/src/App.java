import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double h = sc.nextDouble();
        double vel = sc.nextDouble();

        double litros = h * vel / 12;

        System.out.printf("%.3f%n", litros);
        
        sc.close();
    }
}