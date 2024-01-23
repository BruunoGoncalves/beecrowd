import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X, Y, Km, minutos;

        X = 60;
        Y = 30;
        
        Km = sc.nextInt();

        minutos = (X * Km) / Y;

        System.out.printf("%d minutos", minutos);
        
        sc.close();
    }
}