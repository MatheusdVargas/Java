/*
Escreva um novo programa, alterando o exercício 4, e conte também quantos dos 50 números
estão abaixo da média calculada.
 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int acima = 0;
        int abaixo = 0;
        double lista[] = new double[50];
        double soma = 0;
        double quant = 0;
        for(int i = 0; i < lista.length; i++) {
            lista[i] = leitor.nextDouble();
            quant++;
            soma += lista[i];
        }
        double media = soma / quant;
        for(int i =0; i<lista.length; i++){
            if(lista[i] > media){
                acima++;
            }
        for(int j =0; j<lista.length; j++){
            if(lista[i] < media){
                abaixo++;
            }
            
    }
            System.out.println(media);
            System.out.println(acima);
            System.out.println(abaixo);
    }
}
}
