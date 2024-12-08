/*
Crie um algoritmo que leia os meses e quantos dias eles tem.
 */
package arrays;
/**
 *
 * @author Matheus V
 */
public class Arrays02 {
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Abr", "Mai", "Jun", "Jul", "Ago" , "Set", "Out", "Nov", "Dez"};
        int dias[] = {31, 28, 31, 30, 31, 30 ,31, 31,30, 31, 30, 31};
        for(int c = 0; c < mes.length; c++) {
            System.out.println("O mes de "  + mes[c] + " tem " + dias[c] + " dias ao todo");
        }
    }
    
}
