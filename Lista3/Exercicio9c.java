/*
Escreva um programa que leia a idade de 10 pessoas e mostre “menor de idade” para quem tiver menos de 18 anos
e “maior de idade para os demais”. Ele deve também calcular e mostrar a média da idade das 10 pessoas. Faça 3
versões do programa, utilizando as estruturas de repetição estudadas: “while”, “do...while” e “for”.
 */
package listajava3;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio9c {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int medIdade = 0;
        int idade;
        int contIdade = 0;
        
        // while
        while (contIdade < 10) {
            System.out.println("Idade: ");
            idade = leitor.nextInt();
            medIdade += idade;
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
            contIdade++;
        }
        System.out.println("Media das idades: " + (medIdade / 10));
    }
    
}
