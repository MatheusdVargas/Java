/*
Faça um programa em Java que possua um vetor denominado A que armazene 6 números
inteiros, lidos pelo teclado. O algoritmo deve executar os seguintes passos:
a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
b) Armazene em uma variável inteira (simples) a soma dos valores das posições A[0], A[1] e A[5]
d) o vetor e mostre na tela esta soma.
c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
d) Mostre na tela cada valor do vetor A, um em cada linha
 */
package listaarray;
import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int soma = 0;
        int A[] = new int[6];
        for(int i = 0; i < A.length; i++) {
            A[i] = leitor.nextInt();
            soma = A[0]+ A[1] + A[5];
            A[4] = 100;
        }
        System.out.println(soma);
        for(int j = 0; j < A.length; j++) {
                System.out.println(A[j]);
        }
    }
   
}
