/*
Usando um laço “while”, escreva o programa descrito a seguir. Um usuário quer 
controlar a carga colocada em umcaminhão. 
Ele digita inicialmente a carga máxima do caminhão. 
Em seguida, digita uma sequência de valores correspondente ao peso de itens a serem carregados.
O programa deve somar o peso dos itens, enquanto o peso digitado não for igual a 0 (zero)
e não ultrapassar a capacidade do caminhão. Quando uma das condições ocorrer,
deve parar e informar a carga total carregada, sem incluir o último, que ultrapassaria a carga máxima.
 */
package listajava3;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int carga;
        
        System.out.print("Digite a carga maxima: ");
        double maximo = leitor.nextDouble();
        
        int cargaTotal = 0;

        System.out.println("Digite os pesos dos itens a serem carregados:  ");
        carga = leitor.nextInt();

        while (carga != 0 && cargaTotal + carga <= maximo) {
            cargaTotal += carga;
            System.out.println("Digite o proximo peso: ");
            carga = leitor.nextInt();
        }

        System.out.println("A carga total carregada e: " + cargaTotal);
    }    
}