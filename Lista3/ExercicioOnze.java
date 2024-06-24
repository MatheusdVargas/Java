/*
Implemente em Java um programa que leia uma quantidade não determinada de pares de números inteiros. O
programa deve parar quando um dos números for zero (0). Pa N) lido, mostre a sequência
crescente de números do menor até o maior e a soma de cada par (M ea de todos os valores da sequência (incluindo o M e N).
 */
package listajava3;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite o primeiro número: ");
            int m = leitor.nextInt();

            if (m == 0) {
                break;
            }

            System.out.print("Digite o segundo número: ");
            int n = leitor.nextInt();

            if (n == 0) {
                break;
            }

            int menor = Math.min(m, n);
            int maior = Math.max(m, n);

            int soma = 0;
            System.out.print("Sequência crescente: ");
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println();

            System.out.println("Soma da sequência: " + soma);
            System.out.println();
        }
    }   
}
