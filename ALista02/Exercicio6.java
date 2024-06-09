/*
 * Escreva um programa que leia 20 números reais (ponto flutuante) pelo teclado e informe qual é o
 * menor e o maior desses números.
*/
package listajava2;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorValor, menorValor;       
        System.out.print("Digite um valor : ");
        double valor = scanner.nextDouble();
        maiorValor = valor;
        menorValor = valor;

        for (int cont = 1; cont < 20; cont++) {
            System.out.print("Digite o valor ");
            valor = scanner.nextDouble();
            
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (valor < menorValor) {
                menorValor = valor;
            }
        }
        System.out.println("Maior valor digitado: " + maiorValor);
        System.out.println("Menor valor digitado: " + menorValor);
    }
}