/*
 Você deve escrever um programa que exiba uma saída como aparece no exemplo abaixo.
 I continua o mesmo numero 3 vezes e soma 2
 J diminui 1 vez duas vezes e aumenta 2 vezes
 */
package listajava3;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 7; j >= 5; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }   
}