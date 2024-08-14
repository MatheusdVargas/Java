/*
Elabore um programa em Java que leia dois vetores de dez elementos reais e faça a
multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro vetor, que
deve ser mostrado como saída.
 */
package listaarray;
import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double lista1[] = new double[10];
        double lista2[] = new double[10];
        for(int i = 0; i < lista1.length; i++) {
            System.out.println("Digite um numero: ");
            lista1[i] = leitor.nextDouble();
            System.out.println("Digite outro numero: ");
            lista2[i] = leitor.nextDouble();
            if(lista1[i] == lista2[i]) {
                double mult = Math.pow(lista1[i], 2);
                double lista3[] = new double[10];
                for(int j = 0; j < lista3.length; j++) {
                    lista3[j] = mult;
                    System.out.println(lista3[j]);
                }
            }
        }
    }
    
}
