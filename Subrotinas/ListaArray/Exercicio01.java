/*
Escreva um programa em Java que leia 100 números reais e armazene num vetor. Em seguida,
exiba o quadrado e o cubo de cada um dos números.
 */
package listaarray;
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double lista[] = new double[100];
        for(int i = 0; i < 100; i++) {
            System.out.println("Digite um numero: ");
            lista[i] = leitor.nextDouble();
            double quadrado = Math.pow(lista[i], 2);
            System.out.println("Quadrado de "+ lista[i] + ": " + quadrado);
            double cubo = Math.pow(lista[i], 3);
            System.out.println("Cubo de "+ lista[i] + ": " + cubo);
        }
    }
    
}
