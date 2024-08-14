/*
Escreva um programa em Java que leia 100 números naturais, cujos valores estão no intervalo
[1, 10], e conte quantos números de cada valor (1 a 10) existe
 */
package listaarray;
import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[100];
        int conval[] = new int[10];
        for(int i = 0; i < lista.length; i++) {
            lista[i] = leitor.nextInt();
        }
        for(int cont = 1; cont <=10; cont++) {
            for(int j = 0; j < lista.length; j++) {
                if(lista[j] == cont+1) {
                    conval[cont]++;
                }
            }
            if(conval[cont] >=2) {
                System.out.println(conval[cont]);
            }

        }
    }
    
}
