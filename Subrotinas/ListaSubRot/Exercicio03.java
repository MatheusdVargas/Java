/*
Escreva um novo programa, alterando o exercício 1, pesquisando qual é o menor e o maior dos 50 números.
*/

import java.util.Scanner;
public class Exercicio03 {
    
    public static void MaiorMenor(){
        Scanner leitor = new Scanner (System.in);
        double vetor[] = new double [50];
        double maximo, minimo, atual;
        
        System.out.println("Digite um valor real: ");
        maximo = minimo = leitor.nextInt();
        
        for(int i =1; i<50; i++){
            System.out.println("Digite um valor real: ");
            atual = leitor.nextDouble();
            vetor[i]=atual;
            if( atual > maximo ) {
                maximo = atual;
            } else {
                if( atual < minimo ) {
                    minimo = atual;
                }
            }
        }
    }
}

