/**
 * Escreva um programa que exiba o quadrado de cada um dos números pares entre 1 e 1000,
inclusive
 */
package listajava2;
/**
 *
 * @author Matheus V
 */
public class Exercicio3 {
    public static void main(String[] args) {
        for(int num = 1; num <= 1000; num++) {
            if (num % 2 == 0) {
                System.out.println((Math.pow(num, 2)));
            }
        }
    }
    
}
