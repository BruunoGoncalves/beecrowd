import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nFun, nHr;
        double salario, salary;

        nFun = sc.nextInt();
        nHr = sc.nextInt();
        salario = sc.nextDouble();

        salary = salario * nHr;

        System.out.println("NUMBER = " + nFun);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
