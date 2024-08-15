/*
 Escreva um programa em Java que leia e armazene 50 números reais.
 */

import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numeros[] = new double[50];
        for(int i = 0; i < 50; i++) {
            numeros[i] = leitor.nextDouble();
        }
    }
    
}
