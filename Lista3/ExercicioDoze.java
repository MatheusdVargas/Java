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
        Scanner leitor = new Scanner (System.in);
        
        String mensagem;
        while( ! (mensagem = leitor.nextLine().toLowerCase() ).equals("tchau") ){
            
            for(int ind=0; ind<mensagem.length(); ind++){
                char caractere = mensagem.charAt(ind);
                System.out.print(caractere);
                
                switch(caractere){
                    case'a':
                    case'e': 
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Vogal ");
                    break;
                    case'b':
                    case'c':
                    case'd':
                    case'f':
                    case'g':
                    case'h':
                    case'j':
                    case'k':
                    case'l':
                    case'm':
                    case'n':
                    case'p':
                    case'q':
                    case'r':
                    case's':
                    case't':
                    case'v':
                    case'w':
                    case'x':
                    case'y':
                    case'z':
                        System.out.println(" Consoante ");
                    break;
                    default:
                        System.out.println(" Invalido ");
                    break;
                }
            }
        }
    }    
}
