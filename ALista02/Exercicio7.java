/*
 * Utilizando um laço do tipo “for”, escreva um programa que calcule e exiba a soma dos inversos
 * (1/x) de todos os números de 2 até 10.
*/
package listajava2;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio7 {
    public static void main(String[] args) {
        double soma = 0.0;
        // Somatorio dos inveersos = 1.9290123456790123
        for (int cont = 2; cont <= 10; cont++) {
            soma += Math.pow(cont, -1);
        }
        System.out.println("A soma dos inversos de 2 a 10 e: " + soma);
    }
    
}
