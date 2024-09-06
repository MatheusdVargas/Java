/*
Escreva um programa que crie uma pilha para armazenar valores inteiros. Faça a leitura, a partir
do teclado, de 25 valores e armazene na pilha. Retire cada um dos elementos da pilha e
armazene-os em duas novas pilhas, uma somente para valores pares negativos e a outra para
valores ímpares positivos. Descarte todos os demais.
 */
package listapilhaefila;
import java.util.Stack;
import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Stack <Integer> pilha = new Stack();
        Stack <Integer> pilha2 = new Stack();
        Stack <Integer> pilha3 = new Stack();
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            int num = leitor.nextInt();
            pilha.push(num);
            if(num > 0){
                pilha2.push(num);
                pilha.pop();
            } else {
                if(num < 0) {
                    pilha3.push(num);
                    pilha.pop();
                } else {
                    pilha.pop();
                }
            }
        }
        System.out.println(pilha2);
        System.out.println(pilha3);
    }
    
}
