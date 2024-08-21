/*
Escreva um programa em Java que leia e armazene 50 números reais.
*/
import java.util.Scanner;
public class Exercicio01 {
    
    public static void Ler(){
        Scanner leitor = new Scanner (System.in);
        double vetor[] = new double [50];
        for(int i =0; i<50; i++){
            System.out.println("Digite um valor: ");
            double num = leitor.nextDouble();
            vetor[i]=num;
        }
    }
}
