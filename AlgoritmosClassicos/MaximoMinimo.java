/**
 * Algoritmo Classico de Pesquisa de Maximo e Minimo de um Conjunto de Numeros
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class MaximoMinimo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // As variaveis maximo e minimo v�o armazenar,respectivamente, qual � o
        // MAIOR e o MENOR valor atual na busca
        int maximo, minimo;
        int valorAtual; // variavel que ira receber cada numero informado
        
        // Quando tivermos lido o PRIMEIRO dos numeros, por uma razao obvia de 
        // ser, por enquanto, o �nico, ele tamb�m � o MAIOR e o MENOR de todos
        maximo = minimo = leitor.nextInt();
        
        // Como um valor j� foi lido, o loop for vai precisar ler um numero a 
        // menos, iniciando de 1, em vez de 0.
        for(int i= 1; i<10; i++) {
            // leitura do proximo numero
            valorAtual = leitor.nextInt();
            
            // Compara-se o valorAtual que acabou de ser lido com o n�mero que,
            // at� o momento, era o m�ximo. Se isso ocorrer, substituimos o
            // maximo pelo valorAtual
            if( valorAtual > maximo ) {
                maximo = valorAtual;
            } else {
                // N�o sendo maior que o maximo, o valorAtual pode ser menor que
                // o minimo at� o momento. Se isso ocorrer, substituimos o
                // minimo pelo valorAtual
                if( valorAtual < minimo ) {
                    minimo = valorAtual;
                }
            }
        }
        System.out.println(maximo);
        System.out.println(minimo);
    }
}