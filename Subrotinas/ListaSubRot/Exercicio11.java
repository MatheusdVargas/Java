/*
Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 99.
e retorne uma String correspondente ao número por extenso.
Caso o número esteja fora do intervalo, o método deve retornar o texto “inválido”.
*/
public class Exercicio11 {
    
        public static String EscreveMUITO(int numero) {
        if (numero < 1 || numero > 99) {
            return "inválido";
        }

        String[] unidades = {
            "", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove"
        };

        String[] especiais = {
            "dez", "onze", "doze", "treze", "catorze", 
            "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
        };

        String[] dezenas = {
            "", "", "vinte", "trinta", "quarenta", "cinquenta", 
            "sessenta", "setenta", "oitenta", "noventa"
        };

        if (numero < 10) {
            return unidades[numero];
        } else if (numero < 20) {
            return especiais[numero - 10];
        } else {
            int dezena = numero / 10;
            int unidade = numero % 10;

            if (unidade == 0) {
                return dezenas[dezena];
            } else {
                return dezenas[dezena] + " e " + unidades[unidade];
            }
        }
    }
}
