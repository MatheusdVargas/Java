/*
Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 99.999,
e retorne uma String correspondente ao número por extenso. Caso o número esteja fora do
intervalo, o método deve retornar o texto “inválido".
*/
public class Exercicio13 {
    
        public static String eunaoaguentomais(int numero) {
        if (numero < 1 || numero > 99999) {
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

        String[] milhares = {
            "", "mil", "dois mil", "três mil", "quatro mil", 
            "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil"
        };

        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int milhar = (numero / 1000) % 10;
        int dezMilhar = numero / 10000;

        String resultado = "";

        // Tratar dezenas de milhar
        if (dezMilhar == 1) {
            resultado += especiais[milhar];
        } else if (dezMilhar > 1) {
            resultado += dezenas[dezMilhar];
            if (milhar > 0) {
                resultado += " e " + unidades[milhar];
            }
        } else if (milhar > 0) {
            resultado += milhares[milhar];
        }

        // Tratar centenas, dezenas e unidades
        if (centena > 0) {
            if (!resultado.isEmpty()) {
                resultado += " e ";
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

        return resultado.trim();
    }

}
