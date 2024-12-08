/*
Crie um algoritmo que leia os meses e quantos dias eles tem contabilizando o
ano bissexto.
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author Matheus V
 */
public class Arrays03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String mes[] = {"Jan", "Fev", "Abr", "Mai", "Jun", "Jul", "Ago" , "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30 ,31, 31,30, 31, 30, 31};
        
        System.out.println("Digite um ano: ");
        int ano = leitor.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            dias[1] = 29;
        }
        
        for(int c = 0; c < mes.length; c++) {
                System.out.println("O mes de "  + mes[c] + " tem " + dias[c] + " dias ao todo");
        }
    } 
}
