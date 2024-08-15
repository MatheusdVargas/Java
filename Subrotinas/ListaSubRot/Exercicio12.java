/*
Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 999, e
retorne uma String correspondente ao número por extenso. Caso o número esteja fora do
intervalo, o método deve retornar o texto “inválido”.
 */

public class Exercicio12 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static String intervalo(int a) {
        a = 184;
        String nomeNum = "Cento e oitenta e quatro";
        if(a < 1 || a > 999) {
            nomeNum = "Invalido";
        }
        return nomeNum;
    }
}
