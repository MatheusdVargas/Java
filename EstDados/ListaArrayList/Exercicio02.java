/*
Escreva um programa em Java que crie uma lista para armazenar valores inteiros.
Faça a leitura,a partir do teclado, de 30 valores e armazene na lista.
Percorra a lista e informe o índice de todos os valores armazenados que são ímpares.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList();
        for(int i = 0; i < 30; i++) {
            int num = leitor.nextInt();
            lista.add(num);
        }
        for (int i = 0; i < lista.size(); i++) {
            int valor = lista.get(i);
            if (valor % 2 != 0) {
                System.out.println("indice de um valor impar na lista: " + i);
            }
        }
    }
    
}
