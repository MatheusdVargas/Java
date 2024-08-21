/*
Escreva um método que receba como parâmetro um número inteiro.
no intervalo de 1 a 20.
retorne uma String correspondente ao número por extenso. 
Caso o número seja menor que 1 ou maior que 20, o método deve retornar o texto “inválido”.
*/
public class Exercicio10 {
    public static String EscreveEscreve(int numero) {
        String[] numerosPorExtenso = {
            "um", "dois", "três", "quatro", "cinco", 
            "seis", "sete", "oito", "nove", "dez", 
            "onze", "doze", "treze", "catorze", "quinze", 
            "dezesseis", "dezessete", "dezoito", "dezenove", "vinte"
        };

        if (numero < 1 || numero > 20) {
            return "inválido";
        }

        return numerosPorExtenso[numero - 1];
    }
}