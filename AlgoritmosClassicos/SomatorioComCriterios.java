
/**
 * Algoritmo Classico de Somatorio de Numeros Utilizando Criterios
 * Exemplo com leitura de 10 numeros inteiros informados pelo usuario.
 * Aqui o criterio � somar apenas numeros que sejam POSITIVOS (>0)
 *
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class SomatorioComCriterios {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumula��o (somatorio) dos valores
        int soma = 0; // O ZERO � o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado

        for (int i = 0; i < 10; i++) {
            valor = leitor.nextInt();
            
            // Nese comando condicional � especificado o CRITERIO para realizar
            // ou n�o a acumula��o do valor.
            if (valor > 0) {
                // comando classico de ACUMULACAO: usa o valor anterior de 
                // "soma", adiciona novo "valor" e armazena novamente em "soma"
                soma = soma + valor;
            }
        }
        System.out.println(soma);
    }
}