/*
Astolfo tem hoje 1,50 m (150 cm) e cresce 3 cm por ano. Basileu tem 1,30 m (130 cm) e cresce 5 cm por ano.
Usando um laço “while”, escreva um programa que calcule e exiba quantos anos são necessários para Basileu ser
mais alto que Astolfo, bem como as alturas dos dois após esse tempo.
 */
package listajava3;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio8 {
    public static void main(String[] args) {
        double astolfo = 150;
        double basileu = 130;
        int contadorAno = 0;
        do {
            astolfo += 3;
            basileu += 5;
            contadorAno++;
            System.out.println(astolfo + " e " + basileu);
            System.out.println("Ano: " + contadorAno);
        } while (astolfo > basileu);
    }   
}
