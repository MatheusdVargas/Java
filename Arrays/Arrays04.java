/*
Um professor possui uma turma com 10 alunos. Ele precisa armazenar os nomes e as notas
de duas avaliações. Ao final, ele precisa da média de cada aluno, a media por prova, a media geral
a nota maxima e minima por prova , a maior e a menor media e quantos estao abaixo e acima da media.
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author Matheus V
 */
public class Arrays04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome[] = new String[10];
        double notas[][] = new double[10][2]; 
        for(int i = 0; i < 10; i++) {
            nome[i] = leitor.nextLine();
        }
        for(int a = 0; a < 10; a++) {
            System.out.println("Nota de " + nome[a]);
            for(int n = 0; n < 2; n++) {
                notas[a][n] = leitor.nextDouble();
                
                
            }
        }
    }  
}
