// importa a biblioteca do javascanner (leitor de teclado)
import java.util.Scanner;
// cria a classe publica leitura5 (leitura5.class)
public class leitura5 {
    // define o ponto de entrada do programa
    public static void main(String[] args) {
        // cria um leitor
        Scanner ler = new Scanner(System.in);
        // exibe uma mensagem que pode ser resosndida pelo usuario
        System.out.print("Quantas quantidades do produto voce deseja? ");
        // armazena essa resposta na variavel inteira "quant"
        int quant = ler.nextInt();
        // cria a variavel "preçoprod" e armazena o valor 3.90 nela
        double preçoprod = 3.90;
        // cria a variavel preço1 que armazena o produto das variaveis "quant" e "preçoprod"
        double preço1 = (quant * preçoprod); 
        // cria um segundo leitor 
        Scanner ler2 = new Scanner(System.in);
        // exibe uma mensagem que pode ser resondida pelo usuario
        System.out.print("Quantas unidades desse outro produto voce deseja? ");
        // cria a variavel "quant2" e armazena a resposta da pergunta anterior
        int quant2 = ler2.nextInt();
        // cria a variavel "preçoprod2" e armazena o valor 5 nela
        double preçoprod2 = 5.00;
        // cria a variavel "proço2" que armazena o produto entre as variaveis "quant2" e "preçpprod2"
        double preço2 = (quant2 * preçoprod2);
        // cria a varivel "total" que armazena a soma entre as variaveis "preço1" e "preço2"
        double total = (preço1 + preço2);
        // exibe uma mensagem junto a variavel "preço1"
        System.out.println("Sua primeira compra sera de: " + (preço1));
        // exibe uma mensagem junto a variavel "preço2"
        System.out.println("Sua segunda compra sera de: " + (preço2));
        // exibe uma mensagem junto a variavel "total"
        System.out.println("Sua compra total sera de: " + total);
        // esse programa faz 2 perguntas ao usuario, armazena as respostas em variaveis, cria outras variaveis com os preços dos produtos e faz a multiplicacao entre o preço e a quantidade de produtos, cria outra variavel somando essas multiplicaçoes e exibe tanto os subtotais, quanto o total da compra
    }
}
