/*
Escreva um novo programa, alterando o exercício 1, incluindo o cálculo da média aritmética dos
50 números.
 */
package arrayemetodos;
import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double lista[] = new double[5];
        double soma = 0;
        double quant = 0;
        for(int i = 0; i < 5; i++) {
            lista[i] = leitor.nextDouble();
            quant++;
            soma += lista[i];
        }
        double media = soma / quant;
        System.out.println(media);
    }
    
}
