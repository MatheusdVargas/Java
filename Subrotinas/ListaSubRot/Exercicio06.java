/*
Escreva um algoritmo que leia e armazene num vetor 7 números inteiros que devem estar entre
1 e 99, incluindo os extremos. O programa não pode aceitar valores fora do intervalo.
 */
import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[7];
        for(int i = 0; i < lista.length; i++) {
            int numero = leitor.nextInt();
            if(numero >= 1 && numero <= 99) {
                lista[i] = numero;
            } else {
                if(numero > 99 || numero < 1) {
                    System.out.println("Valor Invalido");
                }
            }

        }
    }
    
}
