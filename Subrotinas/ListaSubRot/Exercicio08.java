
import java.util.Scanner;

/*
Escreva um novo programa, alterando o exercício 7, e leia e armazene, num vetor diferente do
anterior, mais 6 números inteiros, que devem estar entre 1 e 99, incluindo os extremos.
 */

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[7];
        int lista2[] = new int[6];
        for(int i = 0; i < 7; i++) {
            int numero = leitor.nextInt();
            if(numero >= 1 && numero <= 99) {
                lista[i] = numero;
            } else {
                if(numero > 99 || numero < 1) {
                    System.out.println("Valor Invalido");
                }
            }  
            
        }
        for(int i = 0; i < 6; i++) {
            int numero = leitor.nextInt();
            if(numero >= 1 && numero <= 99) {
                lista2[i] = numero;
            } else {
                if(numero > 99 || numero < 1) {
                    System.out.println("Valor Invalido");
                }
            }
        }
    }
}
