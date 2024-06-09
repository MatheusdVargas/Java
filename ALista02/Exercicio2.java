/**
 * Escreva um programa que exiba os números divisíveis por 7 no intervalo de 1000 a 7000,
inclusive.
 */
package listajava2;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio2 {
    public static void main(String[] args) {
        for(int num = 1000; num<= 7000; num++) {
            if(num % 7 == 0) {
                System.out.println(num);
            }
        }
    }
    
}
