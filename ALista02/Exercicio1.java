/**
 * Escreva um programa que exiba os números pares no intervalo de 1 a 1000, inclusive.
 */
package listajava2;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio1 {
    public static void main(String[] args) {
        for(int num = 1; num <= 1000; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    
}
