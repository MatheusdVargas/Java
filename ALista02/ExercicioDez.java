/*
 * Jocasta precisa escrever um programa para a aula de biologia, no qual ela irá classificar animais.
 * Ela vai informar se são aves (1), mamíferos (2) ou répteis (3). Em seguida, vai informar o tipo de
 * alimentação: herbívoros (1) ou carnívoros (2). Ao final, o programa vai identificar o animal com
 * base nessas duas informações.
*/
package listajava2;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class ExercicioDez {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("[ 1 ] ave \n[ 2 ] mamifero \n[ 3 ] repteis");
        int especie = leitor.nextInt();
        System.out.println("[ 1 ] herbivoro \n[ 2 ] carnivoro");
        int alimentacao = leitor.nextInt();
        String animal = "";
        switch (especie) {
                case 1:
                    if (alimentacao == 1) {
                        animal = "Papagaio";
                        break;
                    } else if (alimentacao == 2) {
                        animal = "Aguia";
                        break;
                    }
                case 2:
                    if (alimentacao == 1) {
                        animal = "Vaca";
                        break;
                    } else if (alimentacao == 2) {
                        animal = "Leão";
                        break;
                    } 
                case 3:
                    if (alimentacao == 1) {
                        animal = "Tartaruga";
                        break;
                    } else if (alimentacao == 2) {
                        animal = "Cobra";
                        break;
                    } 
            }
        System.out.println(animal);
    }
    
}
