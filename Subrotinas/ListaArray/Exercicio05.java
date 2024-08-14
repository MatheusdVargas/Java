/*
Escreva um programa em Java que leia 10 números inteiros. Como saída, deve informar se
existe algum igual. Não precisa informar quais são os números, apenas se há duplicatas.
 */
package listaarray;
import java.util.Scanner;
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[10];
        boolean duplicado = false;
        for(int i = 0; i < 10; i++) {
            int num = leitor.nextInt();
            lista[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (lista[i] == lista[j]) {
                    duplicado = true;
                }
            }
        }
        if(duplicado) {
                System.out.println("Ha um numero duplicado");
            } else {
                System.out.println("nao ha numeros duplicados");
            }
    }
}
