/*
Escreva um método recursivo que some todos os elementos de um vetor de reais que for
passado como parâmetro de entrada para o método.
 */

public class Exercicio15 {

    public static void main(String[] args) {
        double listaNum[] = {1, 5.5, 6, 13, 3.2};
    }
    public static double soma(double listaNum[]) {
        double soma = 0;
        for(int i = 0; i < listaNum.length; i++) {
            soma += listaNum[i];
        }
        return soma;
    }
}
