/*
Escreva um programa que crie uma fila para armazenar valores inteiros. Faça a leitura, a partir
do teclado, de 30 valores e armazene na fila. Retire cada um dos elementos da fila e
armazene-os em duas novas filas, uma somente para valores positivos e a outra para valores
não-positivos.
 */
package listapilhaefila;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Queue<Integer> fila = new LinkedList<>();
        
        Queue<Integer> filaPositivos = new LinkedList<>();
        Queue<Integer> filaNegativos = new LinkedList<>();

        for (int i = 0; i < 30; i++) {
            int valor = leitor.nextInt();
            fila.add(valor);
        }

        while (!fila.isEmpty()) {
            int valor = fila.remove(); 
            if (valor > 0) {
                filaPositivos.add(valor); 
            } else {
                filaNegativos.add(valor);
            }
        }
        System.out.println("Positivos:" + filaPositivos);
        System.out.println("Negativos: " + filaNegativos);
    }
    
}
