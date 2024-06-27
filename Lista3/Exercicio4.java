/*
Escreva um programa que leia um número inteiro qualquer e identifique se ele é primo. Números primos são todos
aqueles que são divisíveis apenas por 1 e por si mesmos.
 */
package listajava3;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = leitor.nextInt();
        int divisores = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                divisores++;
            }
        }
        if(divisores == 2) {
            System.out.println("Esse numero e primo");
        } else {
            System.out.println("Esse numero nao e primo");
        }
    }
    
}
