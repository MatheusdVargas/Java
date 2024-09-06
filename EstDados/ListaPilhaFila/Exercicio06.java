/*
Escreva um programa que crie uma fila para armazenar valores inteiros. Em seguida, faça a
leitura, a partir do teclado, de 20 valores e armazene na fila. Ao final, retire todos os elementos
da fila e imprima na tela cada um.
 */
package listapilhaefila;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            int valor = leitor.nextInt();
            fila.add(valor); 
        }
        
        while (!fila.isEmpty()) {
            System.out.println(fila.remove());
        }
    }
}
