/*
Escreva um novo programa, alterando o exercício 7, e leia e armazene, num vetor diferente do
anterior, mais 6 números inteiros, que devem estar entre 1 e 99, incluindo os extremos.
*/
import java.util.Scanner;
public class Exercicio08 {
    
    public static void LeitorBusca2Array(){
        Scanner leitor = new Scanner (System.in);
        int vetor[] = new int [7];
        for(int i =0; i<vetor.length; i++){
            System.out.println("Digite um valor inteiro entre 1 e 99 para o PRIMEIRO vetor: ");
            int valor = leitor.nextInt();
            if(valor > 99){
                System.out.println("Voce digitou o valor errado!");
                i--;
            }else{
                if(valor < 1){
                    System.out.println("Voce digitou o valor errado");
                    i--;
                }else{
                    vetor[i]=valor;
                }
            }
        }
        int array[] = new int [6];
        for(int i =0; i<array.length; i++){
            System.out.println("Digite um valor inteiro entre 1 e 99 para o SEGUNDO vetor: ");
            int valor = leitor.nextInt();
            if(valor > 99){
                System.out.println("Voce digitou o valor errado!");
                i--;
            }else{
                if(valor < 1){
                    System.out.println("Voce digitou o valor errado");
                    i--;
                }else{
                    array[i]=valor;
                }
            }
        }
    }
}

