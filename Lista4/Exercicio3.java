/*
 Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida,
extraia e imprima a primeira palavra da cadeia.
 */
package listajava4;
import java.util.Scanner;
/**
 *
 * @author Matheus V
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = leitor.nextLine();
        // index = indice
        int index = frase.indexOf(' ');
        
        if (index != -1) {
            String primeiraParte = frase.substring(0, index);

            System.out.println(primeiraParte);
        }
    }
    
}
