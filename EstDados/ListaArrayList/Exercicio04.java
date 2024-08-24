/*
Escreva um programa em Java que crie uma lista para armazenar valores inteiros.
Faça a leitura,a partir do teclado, de 15 valores e armazene na lista.
Crie uma segunda lista para numeros inteiros.
Percorra a primeira lista e remova todos os valores armazenados que são ímpares,
inserindo-os na segunda lista.
Exiba todos os valores inseridos na segunda lista
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList();
        ArrayList <Integer> lista2 = new ArrayList();
        for(int i = 0; i < 25; i++) {
            int num = leitor.nextInt();
            lista.add(num);
        }
        
        for (int i = 0; i < lista.size(); i++) {
            int valor = lista.get(i);
            if (valor % 2 != 0) {
                lista2.add(valor); 
                lista.remove(i);
            }
        }
        System.out.println("Valores da Lista de numeros impares (lista2): " + lista2);
    }
    
}
