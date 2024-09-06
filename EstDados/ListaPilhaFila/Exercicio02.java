/*
Escreva um programa que crie uma pilha para armazenar valores inteiros. Faça a leitura, a partir
do teclado, de 30 valores e armazene na pilha. Retire cada um dos elementos da pilha e
armazene-os em duas novas pilhas, uma somente para valores pares e a outra para valores
ímpares.
 */
package listapilhaefila;
import java.util.Stack;
import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Stack <Integer> pilha01 = new Stack();
        Stack <Integer> pilha02 = new Stack();
        Stack <Integer> pilha03 = new Stack();
        
        for(int i = 0; i < 30; i++) {
            System.out.print("Digite um numero: ");
            int num = leitor.nextInt();
            pilha01.push(num);
            if(num % 2 == 0) {
                pilha02.add(num);
                pilha01.pop();
            } else {
                pilha03.push(num);
                pilha01.pop();
            }
        }
        System.out.println(pilha02);
        System.out.println(pilha03);
    }
    
}
