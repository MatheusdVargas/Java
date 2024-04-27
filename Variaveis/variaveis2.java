// cria uma classe publica (que pode ser acessada por outras classes) com o nome de Incrementando
public class variaveis2 {
    // expoe a proxima variavel a ser declarada
    public static void main(String[] args) {
    // declara uma variavel de numero inteiro e atribui o valor 5 a ela
    int valor = 5;
    // Mostra o valor da variavel (valor) mais 1 (unidade) no terminal
    System.out.println( valor++ );
    // Mostra o valor da variavel (valor) no terminal
    System.out.println( valor );
    // Declara que a variavel (valor) vale 10
    valor = 10;
    // Mostra o valor da variavel (10) mais 1 (unidade) no terminal
    System.out.println( valor++ );
    // Mostra o valor da variavel (10) no terminal
    System.out.println( valor );
    // Esse programa faz com que a maquina escreva no terminal o valor da variavel
    // criada mais 1 (unidade), e depois o computador escreva o valor da variavel sem nenhuma alteração
    }
    }