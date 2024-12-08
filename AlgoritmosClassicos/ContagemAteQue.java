/**
 * Algoritmo Classico de Contagem de Uma Quantidade Indefinida de Numeros
 * (At� que algum crit�rio de "parada" seja satisfeito.
 * Exemplo com leitura de N numeros inteiros informados pelo usuario. Aqui, o
 * criterio de parada definido � que o numero lido seja igual a ZERO.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class ContagemAteQue {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel contador vai armazenar a quantidade de valores
        int contador = 0; // O ZERO � o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado
        
        // "leitor.nextInt()" fara a leitura do valor informado pelo usuario
        // e sera atribuido a "valor", e logo em seguida � verificado se esse
        // numero informado � DIFERENTE de ZERO. Se n�o for, a condicao do
        // "while" n�o � satisfeita e o la�o encerra.
        while((valor=leitor.nextInt()) != 0 ) {
        // Se o programador desejar, a leitura de valor nem precisa ser
        // armazenada, sendo possivel escrever o while da seguinte forma:
        // while( leitor.nextInt() != 0 ) {
        
            // comando classico de CONTAGEM: incremento simples (++)
            contador++; 
        }
        System.out.println(contador);
    }
}