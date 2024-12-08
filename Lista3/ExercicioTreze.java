/*
Antonella está pesquisando o crescimento de árvores num bosque que se recuperando de um incêndio. Atualmente,
as árvores possuem uma altura de 1,5 m. Ela quer verificar o crescimento ano a ano, até uma dada altura máxima,
sabendo que a árvore cresce a uma taxa percentual mais ou menos fixa. É preciso escrever um programa que leia a
taxa de crescimento (em percentual, ex.: 15%) e o tamanho máximo desejado (em metros) e deve exibir o tamanho
a cada ano
 */
import java.util.Scanner;
package listajava3;
/**
 *
 * @author Matheus de Vargas
 */
public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double altInicial = 1.5;
        double altAtual = altInicial;
        
        System.out.println("Digite a taxa de crescimento de uma arvore em %: ");
        double taxaCresc = leitor.nextDouble();
        
        System.out.println("Digite a altura maxima desejada: ");
        double altFinal = leitor.nextDouble ();
        
        int ano = 0;
        
        while( altAtual < altFinal){
            ano++;
            altAtual= altAtual*(1.0 + taxaCresc/100.0);
            System.out.println("Ano " + ano + ": " + altAtual);
        }
    }
}
