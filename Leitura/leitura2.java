// importa a biblioteca java.util.scanner
import java.util.Scanner;
//  define uma classe publica com o nome leitura2 (leitura2.class)
public class leitura2 {
    // declara o ponto de entrada desse programa
    public static void main(String[] args) {
        // faz o computador ler e armazenar a resposta da proxima pergunta
        Scanner ler = new Scanner(System.in);
        // exibe a mensagem "Digite um numero para incrementacao:" no terminal, essa mensagem pode ser respondida pelo ususario
        System.out.print("Digite um numero (inteiro) para incrementacao: ");
        // essa resposta fica armazenada na variavel inteira "num"
        int num = ler.nextInt();
        // altera o valor de "num" colocando mais uma unidade nele
        num = num + 1;
        // exibe o numero "num" com a incrementação
        System.out.println(num);
        // // altera o valor de "num" colocando mais uma unidade nele
        num = num + 1;
        // exibe o novo valor de num
        System.out.println(num);
        // Esse programa utiliza da biblioteca Scanner para ler a resposta do usuario, armazena=la em uma variavel de valor inteiro, e exibi-lo com modificaçôes (adição de unidades na valriavel "num")
    }
}
