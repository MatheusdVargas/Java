/*
Escreva um programa para converter um número inteiro decimal para binário. 
Leia um número inteiro decimal do usuário. - X
Enquanto o quociente da divisão for maior que zero, calcule o resto da divisão por 2 e empilhe esse resto. 
Use o novo quociente como divisor e prossiga.
Ao final, desempilhe os elementos e concatene-os para formar o número binário. 
Na figura abaixo é demonstrado um exemplo da primeira etapa, que é o cálculo e empilhamento.
 */
package listapilhaefila;
import java.util.Scanner;
import java.util.Stack;
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Stack <Integer> pilha = new Stack();
        int decimal = leitor.nextInt();
        while(decimal % 2 > 0) {
            
        }
    }
    
}
