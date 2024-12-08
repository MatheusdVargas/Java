/**
 * Algoritmo Classico de Pesquisa de Minimo de um Conjunto de Numeros
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class Minimo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel minimo vai armazenar qual � o valor MINIMO atual na busca
        int minimo;
        int valorAtual; // variavel que ira receber cada numero informado
        
        // Quando tivermos lido o PRIMEIRO dos numeros, por uma razao obvia de 
        // ser, por enquanto, o �nico, ele tamb�m � o MENOR de todos
        minimo = leitor.nextInt();
        
        // Como um valor j� foi lido, o loop for vai precisar ler um numero a 
        // menos, iniciando de 1, em vez de 0.
        for(int i= 1; i<10; i++) {
            // leitura do proximo numero
            valorAtual = leitor.nextInt();
            
            // Compara-se o valorAtual que acabou de ser lido com o n�mero que,
            // at� o momento, era o m�nimo. Se isso ocorrer, substituimos o
            // minimo pelo valorAtual
            if( valorAtual < minimo ) {
                minimo = valorAtual;
            }
        }
        System.out.println(minimo);
    }
}