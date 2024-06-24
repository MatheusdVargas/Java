/*
Implemente um programa em Java que leia diversas Strings até que uma seja igual a “tchau” (pode estar escrito
com minúsculas, maiúsculas ou misturado). O programa deve imprimir cada um dos caracteres da string, um por
linha, em minúsculas, informando se é “vogal”, “consoante” ou “branco”. Em todos os outros casos, incluindo letras
acentuadas e com cedilha ou outros caracteres, deve informar “inválido”.
 */
package listajava3;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (true) {
            System.out.println("Digite uma palavra: ");
            String palavra = leitor.nextLine().toLowerCase();

            if (palavra.equals("tchau")) {
                break;
            }
            
            for (int i = 0; i < palavra.length(); i++) {
                char caractere = palavra.charAt(i);

                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    System.out.println(caractere + " - vogal");
                } else {
                    System.out.println(caractere + " - consoante");
                   // nao consegui tirar o consoante dos caracteres especiais
                } if (Character.isWhitespace(caractere)) {
                    System.out.println(caractere + " - Caractere em Branco");
                } if (palavra.matches(".*[^a-zA-Z0-9].*")) {
                    System.out.println("Caractere especial");
                }
            }
        }
    }    
}
        
       
