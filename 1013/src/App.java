/*
* Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
*
* MaiorAB = (a + b + Math.abs(a - b)) / 2;
*
* Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
*
* Entrada
* O arquivo de entrada contém três valores inteiros.
* 
* Saída
* Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int MaiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;

        System.out.println(maior + " eh o maior");

        sc.close();
    }
}