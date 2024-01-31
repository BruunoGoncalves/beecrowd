import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        int ano = valor / 365;
        valor %= 365;

        int mes = valor / 30;
        valor %= 30;

        int dia = valor;

        System.out.println(ano + " ano (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");

        sc.close();
    }
}
