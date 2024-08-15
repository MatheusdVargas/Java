/*
Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 20, e
retorne uma String correspondente ao número por extenso. Caso o número seja menor que 1 ou
maior que 20, o método deve retornar o texto “inválido”.
 */

public class Exercicio10 {

    public static void main(String[] args) {
        
    }
    public static String intervalo(int a) {
        a = 10;
        String numNome = "Dez";
        if(a > 20 || a < 1) {
            numNome = "invalido";
        }
        return numNome;
    }
    
}
