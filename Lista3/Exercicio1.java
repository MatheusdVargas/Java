/*
Você deve escrever um programa que exiba uma saída como aparece no exemplo abaixo:
I aumenta 3 e J diminui 5.
*/
package listajava3;

public class Exercicio1 {
    public static void main(String[] args) {
        int i = -2;
        int j = 65;
        do {
           i += 3;
           j -= 5;
           System.out.println("I: " + i + " J: " + j);
        } while(j >0);
    }
}