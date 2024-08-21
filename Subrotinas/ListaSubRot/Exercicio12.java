/*
Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 999, e
retorne uma String correspondente ao número por extenso. Caso o número esteja fora do
intervalo, o método deve retornar o texto “inválido”.
*/
public class Exercicio12 {
    
        public static String ESCREVEEE(int numero) {
        if (numero < 1 || numero > 999) {
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

        String[] centenas = {
            "", "cento", "duzentos", "trezentos", "quatrocentos", 
            "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
        };

        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = numero / 100;

        String resultado = "";

        if (centena > 0) {
            if (numero == 100) {
                return "cem";
            }
            resultado += centenas[centena];
        }

        if (dezena == 1) {
            resultado += (resultado.isEmpty() ? "" : " e ") + especiais[unidade];
        } else if (dezena > 1) {
            resultado += (resultado.isEmpty() ? "" : " e ") + dezenas[dezena];
            if (unidade > 0) {
                resultado += " e " + unidades[unidade];
            }
        } else if (unidade > 0) {
            resultado += (resultado.isEmpty() ? "" : " e ") + unidades[unidade];
        }

        return resultado;
    }
}
