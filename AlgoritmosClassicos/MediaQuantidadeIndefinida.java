/**
 * Algoritmo Classico de Media de Uma Quantidade Indefinida de Numeros
 * (At� que algum crit�rio de "parada" seja satisfeito).
 * Nessa varia��o, vamos contar quantos numeros fora lidos e somados.
 * Essa � uma aplicacao do SomatorioComContagemAteQue.
 * Exemplo com leitura de N numeros inteiros informados pelo usuario. Aqui, o
 * criterio de parada definido � que o numero lido seja igual a ZERO.
 * 
 * @author Alexandro Adario <alexandro.adario@erechim.ifrs.edu.br>
 */
import java.util.Scanner;

public class MediaQuantidadeIndefinida {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // A variavel soma vai armazenar a acumula��o (somatorio) dos valores
        int soma = 0; // O ZERO � o elemento neutro da soma
        int valor; // variavel que ira receber cada numero informado
        
        int contador = 0;
        
        // "leitor.nextInt()" fara a leitura do valor informado pelo usuario
        // e sera atribuido a "valor", e logo em seguida � verificado se esse
        // numero informado � DIFERENTE de ZERO. Se n�o for, a condicao do
        // "while" n�o � satisfeita e o la�o encerra.
        while((valor=leitor.nextInt()) != 0 ) {
            // Esse � o comando b�sico para a contagem, um incremento na
            // variavel contador.
            contador++;
            // comando classico de ACUMULACAO: usa o valor anterior de "soma",
            // adiciona um novo "valor" e armazena novamente em "soma"
            soma = soma + valor; 
        }
        // Para o calculo da media � essencial que a variavel de saida "media"
        // seja do tipo real, para contemplarmos as casas decimais. Se os
        // valores de entrada s�o inteiros, � preciso converter um dos numeros
        // da fra��o para double, ou a m�dia resulta errada.
        double media = (soma / (double) contador);
        
        System.out.println(soma); 
        System.out.println(contador);
        System.out.println(media);
    }
}