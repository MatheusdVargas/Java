/*
Escreva um algoritmo que solicite a digitação de uma sequência de números (na forma de um
texto, ex.: “939387473827023904823984274611230934756”) e procure se existe algum par de
números iguais (ex.: “11”, “22” etc)
 */
package listajava4;
import java.util.Scanner;
/**
 *
 * @author Matheus V
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String sequencia = leitor.next();

        boolean encontrouPar = false;

        for (int i = 0; i < sequencia.length() - 1; i++) {
            if (sequencia.charAt(i) == sequencia.charAt(i + 1)) {
                System.out.println("Par de números encontrado: " + sequencia.charAt(i) + "" + sequencia.charAt(i + 1));
            } else {
                System.out.println("Nenhum par encontrado");
            }
        } 

    }
    
}
