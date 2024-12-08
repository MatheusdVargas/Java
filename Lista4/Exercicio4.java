/*
Escreva um algoritmo que solicite a digitação de um texto/frase e, em 
seguida, imprima o número de palavras existente na mesma
 */
package listajava4;
import java.util.Scanner;
/**
 *
 * @author Matheus V
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String texto = leitor.nextLine();
        
        String[] palavras = texto.split(" ");
        
        int numPalavras = palavras.length;
        
        System.out.println(numPalavras);
    }
    
}
