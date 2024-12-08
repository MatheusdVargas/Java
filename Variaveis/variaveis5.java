// classe publica (.class) criada com o nome do arquivo variaveis5
public class variaveis5 {
    // expoe a proxima variavel a ser declarada
    public static void main(String[] args) {
    // cria a variavel de numero inteiro 'produto1' e atribui o valor 2 à ela
    int produto1 = 2;
    // cria a variavel de numero inteiro 'produto2' e atribui o valor 5 à ela
    int produto2 = 5;
    // cria a variavel double 'peço1' e atribui o valor 12 à ela
    double preço1 = 12;
    // cria a variavel double 'peço2' e atribui o valor 3 à ela
    double preço2 = 3;
    // cria a variavel double 'preçocompra1' que multiplica as variaveis produto1 e preço1
    double preçocompra1 = (produto1 * preço1);
    // cria a variavel double 'preçocompra2' que multiplica as variaveis produto2 e preço2
    double preçocompra2 = (produto2 * preço2);
    // cria a variavel double 'total' que soma as variaveis preçocompra1 e preçocompra2
    double total = (preçocompra1 + preçocompra2);
    // faz o computador escrever a string 'Sua primeira compra foi de:' e a variavel preçocompra1 (no terminal)
    System.out.println("Sua primeira compra foi de: " + preçocompra1);
    // faz o computador escrever a string 'Sua segunda compra foi de:' e a variavel preçocompra2 (no terminal)
    System.out.println("Sua segunda compra foi de: " + preçocompra2);
    // faz o computador escrever a string 'A soma de suas compras foi é:' e a variavel total (no terminal)
    System.out.println("A soma das suas compras é: " + (total));
    // Esse sistema lê preços e produtos, multiplica eles para saber o preço total de compra e, em seguida, soma as 2 compras. Depois de todo esse processo ele imprime a mensagem no terminal
    }
    }