// importa a biblioteca javaScanner
import java.util.Scanner;
// define a classe publica leitura3 (leitura3.class)
public class leitura3 {
    //define a entrada do programa
    public static void main(String[] args) {
        // cria um scanner que irá ler e armazenar a resposta da pergunta a seguir
        Scanner ler = new Scanner(System.in);
        // exibe a mensagem "Digite um numero: " que pode ser respondida pelo usuario
        System.out.println("Digite um numero: ");
        // le a resposta do usuario e armazena-a na variavel num1
        int num1 = ler.nextInt();
        // cria um scanner que vai ler e armazenar a resposta dada pelo usuario a pergunta seguinte
        Scanner ler2 = new Scanner(System.in);
        // exibe a mensagem "digite outro numero: " que pode ser respondida pelo usuario
        System.out.println("Digite outro numero: ");
        // cria a variavel de numero inteiro "num2", que armazena a resposta da pergunta anterior
        int num2 = ler.nextInt();
        // exibe a soma entre as variaveis "num1" e "num2"
        System.out.println("Soma: " + (num1 + num2));
        // exibe a subração entre as variaveis "num2" e "num1" 
        System.out.println("Diferença: " + (num2 - num1));
        // exibe o produto de"num1" por "num2"
        System.out.println("Multiplicacao: " + (num1 * num2));
        // exibe o resultado inteiro da divisao entre "num1" e "num2"
        System.out.println("Divisao inteira: " + (num1 / num2));
        // exibe o resto da divisao entre "num1" e "num2
        System.out.println("Resto da divisao: " + (num1 % num2));
        // Esse programa le 2 numeros respondidos pelo usuario e faz as operacoes basicoas do java com eles (soma, subtração, divisao, resto)
    }
}
