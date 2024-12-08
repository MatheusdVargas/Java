/*
Escreva um algoritmo que solicite a digitação de um número de telefone, incluindo o DDD, como
a seguir: “5433211111” e gere uma nova sequência com o número do telefone formatado da
seguinte maneira: “(54)3321-1111”
 */
package listajava4;
import java.util.Scanner;
/**
 *
 * @author Matheus V
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto = leitor.nextLine();
        String ddd = texto.substring(0, 2);
        String parte1 = texto.substring(2, 6);
        String parte2 = texto.substring(6, 10);
        System.out.println("(" + ddd + ")" + parte1 + "-" + parte2);

    }
    
}
