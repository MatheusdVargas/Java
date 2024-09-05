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
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        
        System.out.print("Digite um número inteiro decimal: ");
        int numeroDecimal = scanner.nextInt();

        int numero = numeroDecimal;
        while (numero > 0) {
            int resto = numero % 2;
            pilha.push(resto);
            numero = numero / 2;
        }

        StringBuilder numeroBinario = new StringBuilder();
        while (!pilha.isEmpty()) {
            numeroBinario.append(pilha.pop());
        }

        System.out.println("Número binário: " + numeroBinario.toString());
    }
    
}
