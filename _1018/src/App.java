import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do valor inteiro
        int valor = sc.nextInt();
        int valorOriginal = valor; // Guarda o valor original para impressão

        // Calculando o número de notas de 100
        int n100 = valor / 100;
        valor %= 100; // Atualiza o valor após remover as notas de 100

        // Continua para notas de 50, 20, 10, 5, 2 e 1
        int n50 = valor / 50;
        valor %= 50;

        int n20 = valor / 20;
        valor %= 20;

        int n10 = valor / 10;
        valor %= 10;

        int n5 = valor / 5;
        valor %= 5;

        int n2 = valor / 2;
        valor %= 2;

        int n1 = valor; // O que sobra são notas de 1

        // Impressão do resultado
        System.out.println(valorOriginal);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
