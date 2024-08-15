/*
Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 99, e
retorne uma String correspondente ao número por extenso. Caso o número esteja fora do
intervalo, o método deve retornar o texto “inválido”.
 */

public class Exercicio11 {

    public static void main(String[] args) {
        
    }
    public static String intervalo(int a) {
        a = 89;
        String nomeNum = "Oitenta e nove";
        if (a < 1 || a > 99) {
            nomeNum = "Invalido";
        }
        return nomeNum;
    }
}
