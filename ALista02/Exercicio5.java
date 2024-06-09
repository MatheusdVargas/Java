/**
 * Elabore um programa que receba um número informado pelo teclado e escreva na tela uma
 * sequência dos próximos 10 números após o número recebido. Esse código deve ser
 * implementado utilizando a estrutura de repetição “while”.
 */
package listajava2;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = leitor.nextInt();
        int limite = num + 10;
        while(num < limite) {
           num++;
            System.out.println(num);
        }
    }
}
