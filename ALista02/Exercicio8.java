/*
 * Astolfo tem hoje 1,50 m (150 cm) de altura e cresce 3 cm por ano. Seu primo Basileu tem,
 * atualmente, 1,30 m (130 cm) e cresce 5 cm por ano. Utilizando um laço de repetição, escreva um
 * programa Java que imprima ano a ano a variação de altura dos dois, enquanto (while) Basileu for menor
 * que Astolfo.
*/
package listajava2;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio8 {
    public static void main(String[] args) {
        double astolfo = 150;
        double basileu = 130;
        do {
            astolfo += 3;
            basileu += 5;
            System.out.println(astolfo + " e " + basileu);
        } while (astolfo > basileu);
    } 
}
