/*
 * Escreva um programa que leia (scanner) um número não determinado de valores inteiros (int), parando quando
 * o usuário digitar 0 (zero) e, durante esse processo de leitura, conte a quantidade de valores
 * positivos e a quantidade de valores negativos. Por fim, exiba o percentual de positivos e
 * negativos.
*/
package listajava2;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         int valor;
         int positivo = 0;
         int negativo = 0;
         
         while ((valor = leitor.nextInt()) != 0) {
             if(valor > 0 ) {
                 positivo++;
            } else if(valor < 0) {
                 negativo++;
            }
        }
         int total = positivo + negativo;
         if (total > 0) {
            double percentualPositivos = (positivo / (double) total) * 100;
            double percentualNegativos = (negativo / (double) total) * 100;
            
            System.out.println("Percentual de valores positivos: " + percentualPositivos);
            System.out.println("Percentual de valores negativos: " + percentualNegativos);
        }
    }
}
