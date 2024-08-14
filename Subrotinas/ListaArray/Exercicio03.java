package listaarray;

/*
Escreva um programa em Java que leia 10 números inteiros, e armazene num vetor. Em
seguida, leia mais um número e verifique se ele é igual a um dos 10 números armazenados no
vetor.
*/

import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[10];
        for(int i = 0; i < lista.length; i++) {
            System.out.println("Digite um numero");
            lista[i] = leitor.nextInt();
        }
        System.out.println("Digite outro numero");
        double num = leitor.nextDouble();
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] == num) {
                System.out.println("O numero que esta na posicao " + lista[i]
                + " e igual ao numero que voce digitou.");
            }
        }
    }
   
}
