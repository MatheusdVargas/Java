/*
Escreva um novo programa, alterando o exercício 2, e após o cálculo da média, conte quantos dos 50 números estão acima da média calculada.
*/
import java.util.Scanner;
public class Exercicio04 {
    
    public static void Acima(){
        Scanner leitor = new Scanner (System.in);
        double vetor[] = new double [50];
        double soma =0;
        double contador = 0;
        double acima =0;
        
        for(int i =0; i<50; i++){
            System.out.println("Digite um valor real: ");
            double primeiro = leitor.nextDouble();
            vetor[i]=primeiro;
            contador++;
            soma += vetor[i];
        }
        double media = (soma / contador);
        
        for(int i =0; i<50; i++){
            if(vetor[i] > media){
                acima++;
            }
        }
    }
}
