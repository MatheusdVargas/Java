/*
Escreva um programa que leia uma string. 
Em seguida, empilhe cada um dos caracteres da string, desde o início. 
Desempilhe os caracteres e junte-os (concatene-os numa nova string).
Imprima a nova string.
 */
package listapilhaefila;
import java.util.Scanner;
import java.util.Stack;
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Stack <Character> pilha = new Stack();
        String texto = leitor.nextLine();
        for(int i=0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }
        String newText ="";
        while(!pilha.isEmpty()) {
            newText += pilha.getLast();
            pilha.pop();
        }
        System.out.println(newText);
    }
    
}
