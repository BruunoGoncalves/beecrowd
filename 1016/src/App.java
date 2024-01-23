import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Km, minutos;
        
        Km = sc.nextInt();

        minutos = (60 * Km) / 30;

        System.out.printf("%d minutos%n", minutos);
        
        sc.close();
    }
}