/*
Escreva um programa em Java que crie uma lista para armazenar valores inteiros. Em seguida,
faça a leitura, a partir do teclado, de 20 valores e armazene na lista.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList();
        for(int i = 0; i < 20; i++) {
            System.out.print("Digite um valor: ");
            int num = leitor.nextInt();
            lista.add(num);
        }
    }
    
}
