/**
 * Escreva um programa que leia 10 valores quaisquer, informados pelo usuário. A seguir, informe
 * quantos deles estão dentro do intervalo [10,20] e quantos estão fora do intervalo
 */
package listajava2;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double dentro = 0;
        double fora = 0;
        for (double cont = 0; cont < 10; cont++) {
            System.out.print("Digite um valor: ");
            double valor = leitor.nextDouble();
            if (valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("A seguinte quantidade de numeros estao entre 10 e 20: " + dentro);
        System.out.println("A seguinte quantidade de numeros NAO estao entre 10 e 20: " + fora);
    }
}
