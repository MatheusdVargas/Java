/*
Considere um vetor V, cujo 1 elemento tem indice INICIO e o último, FIM. V está ordenado crescentemente.
A operação de busca binária consiste em localizar o valor CHAVE di vetor.
O procedimento consiste em identificar o índice do elemento central, PIVO e comparar V[PIVO] com a chave.
Se a chave for maior, descarta-se  a metade "inferior" e passa-se a realizar a busca no novo subvetor, que é metade do anterior.
Caso a CHAVE seja menor, sucessivamente, até que se encontre a CHAVE em V ou o INICIO seja meior que o FIM.
 */
package buscas;
import java.util.Scanner;
public class Buscas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int v[] = {3, 4, 9, 11, 15, 22, 37, 48, 53, 64, 79, 81, 94, 101, 110, 115};
        int inicio = 0;
        int pivo;
        int fim = v.length - 1;
        
        int chave = leitor.nextInt();
        do {
            pivo = (inicio + fim) / 2;
            if (chave > v[pivo]) {
                inicio = pivo + 1;
            } else {
                if (chave < v[pivo]) {
                    fim = pivo - 1;
                }
            }
        } while (chave != v[pivo] && inicio <= fim);
        
        if (inicio > fim) {
            System.out.println("Nao encontrado");
        } else {
            System.out.println("Encontrado em: " + pivo );
        }

    }
}
