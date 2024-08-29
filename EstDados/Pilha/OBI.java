/*

 */
package pilha;
import java.util.Stack;
import java.util.Scanner;
public class OBI {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Stack < Integer > pilha = new Stack();
        int quantidade = leitor.nextInt();
        for (int i = 0; i < quantidade; i++) {
            int valor = leitor.nextInt();
            if (valor != 0) {
                pilha.push(valor);
            } else {
                pilha.pop();
            }
        }
        int soma = 0;
        while (! pilha.isEmpty()) {
            int numero = pilha.pop();
            soma += numero;
        }
        System.out.println(soma);
    }
    
}
