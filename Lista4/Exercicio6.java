/*
Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida, crie uma cadeia
de caracteres com todos os caracteres da cadeia original separados por “-”.
 */
package listajava4;
import java.util.Scanner;
/**
 *
 * @author Matheus V
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto = leitor.nextLine();
        int tamanho = texto.length();
        for(int i = 0; i < tamanho; i++) {
            char caracteres = texto.charAt(i);
            System.out.print(caracteres + "-");
        }
    }
    
}
