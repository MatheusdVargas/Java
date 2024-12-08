// importa a biblioteca java.util.scanner
import java.util.Scanner;
//  define uma classe com o nome leitura1 (leitura1.class)
public class leitura1 {
// declara o ponto de entrada para do programa
    public static void main(String[] args) {
// cria a variavel 'leitor' que pode ser, alem de armazenada, lida pelo computador
        Scanner leitor = new Scanner(System.in);
// faz o computador escrever (no terminal) a frase 'Digite um numero inteiro', essa frase pode ser respondida por causa do comando 'Scaanner'
        System.out.print("Digite um numero inteiro: ");
// faz o computador ler a resposta da linha acima
        int privalor = leitor.nextInt();
// apos responder a pergunta da inha 10 o computador irá escrever a resposta no terminal
        System.out.println(privalor);
// Esse programa usa de uma biblioteca, que é como se fosse incrementaçoes para o codigo, no caso agora o codigo pode ser lido pela maquina, assim como podemos fazer perguntas e armazenar respostas, com essas respostas podemos imprimi-las, adiciona-las, guarda-las, etc
    }
}
