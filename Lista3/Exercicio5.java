/*
 Escreva um programa que exiba todos os números primos menores que 100.
 */
package listajava3;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio5 {
    public static void main(String[] args) {
        for (int num = 2; num < 100; num++) {
            boolean ehPrimo = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            
            if (ehPrimo) {
                System.out.print(num + " ");
            }
        }
    }    
}    
    

