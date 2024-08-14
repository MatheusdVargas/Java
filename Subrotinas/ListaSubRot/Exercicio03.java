/*
Escreva um novo programa, alterando o exercício 1, pesquisando qual é o menor e o maior dos
50 números
 */
package arrayemetodos;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numeros[] = new double [50];
        double maximo, minimo, atual;
        
        System.out.println("Digite o valor: ");
        maximo = minimo = leitor.nextInt();
        
        for(int i =1; i<50; i++){
            System.out.println("Digite o valor: ");
            atual = leitor.nextDouble();
            numeros[i]=atual;
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

