/*
Escreva um novo programa, alterando o exercício 2, e após o cálculo da média, conte quantos
dos 50 números estão acima da média calculada.
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int acima = 0;
        double lista[] = new double[50];
        double soma = 0;
        double quant = 0;
        for(int i = 0; i < 50; i++) {
            lista[i] = leitor.nextDouble();
            quant++;
            soma += lista[i];
        }
        double media = soma / quant;
        for(int i =0; i<50; i++){
            if(lista[i] > media){
                acima++;
            }
        System.out.println(media);

    } 
}

