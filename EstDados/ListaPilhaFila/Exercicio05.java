/*
Escreva um programa para converter um número inteiro decimal para binário. Leia um número
inteiro decimal do usuário. Enquanto o quociente da divisão for maior que zero, calcule o resto da
divisão por 2 e empilhe esse resto. Use o novo quociente como divisor e prossiga. Ao final,
Desempilhe os elementos e concatene-os para formar o número binário. Na figura abaixo é
demonstrado um exemplo da primeira etapa, que é o cálculo e empilhamento.
 */
package listapilhaefila;
import java.util.Stack;
import java.util.Scanner;
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int decimal = leitor.nextInt();
        Stack<Integer> pilha = new Stack();

        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.push(resto); 
            decimal = decimal / 2;
        }
        System.out.println("O número binário correspondente é: " + pilha);
    }
}
