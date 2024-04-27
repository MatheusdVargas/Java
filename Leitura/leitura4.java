// importa a biblioteca do javascanner(leitor de teclado)
import java.util.Scanner;
// cria a classe publica leitura4 (leitura4.class)
public class leitura4 {
    // define o ponto de entrada do programa
    public static void main(String[] args){
        // cria um scanner que irá ler a resposta do usuario
        Scanner ler = new Scanner(System.in);
        // exibe a frase "digite sua primeira nota" que pode ser respondida pelo usuario
        System.out.print("Digite sua primeira nota: ");
        // armazena a resposta do usuario na variavel "num1"
        double num1 = ler.nextDouble();
        // cria um scanner que irá ler a proxima resposta do usuario
        Scanner ler2 = new Scanner(System.in);
        // exibe a frase "digite sua segunda nota" que pode ser respondida pelo usuario
        System.out.print("Digite sua segunda nota: ");
        // armazena a resosta na variavel "num2"
        double num2 = ler2.nextDouble();
        // // cria um scanner que irá ler resposta do usuario
        Scanner ler3 = new Scanner(System.in);
        // exibe a frase "digite sua terceira nota" que pode ser respondida pelo usuario
        System.out.print("Digite sua terceira nota: ");
        // armazena a resposta na variavel "num3"
        double num3 = ler3.nextDouble();
        // cria a variavel de tipo double soma que é a soma entre as variaveis num1, num2 e num3 
        double soma = (num1 + num2 + num3);
        // cria a variavel media que faz a media entre as variaveis num1, num2 e num3
        double media = (num1 +num2 +num3) / 3;
        // exbibe a variavel soma junto com uma mensagem
        System.out.println("A soma de suas notas é: " + (soma));
        // exibe a variavel media junto a uma mensagem
        System.out.println("A media aritimetica de suas notas é: " + (media));
        // Esse programa faz 3 perguntas ao usuario e armazena as resostas em variaveis do tipo double, pega essas variaveisw com as resostas, cria uma outra variavel com a soma das resostas e outra com a media aritimetca e exibe=as no terminal
    }
}
