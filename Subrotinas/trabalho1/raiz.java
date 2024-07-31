package trabalho1;

import java.util.Scanner;

public class raiz {
    private static Scanner leitor = new Scanner(System.in);
    public static double raiz( double indice, double radicando) {
        indice = leitor.nextDouble();
        radicando = leitor.nextDouble();
        double resultado = Math.pow(radicando, (1.0 / indice));
        
        return resultado;
    }
    public static void main(String[] args ) {
        System.out.println(raiz(5, 32));
        System.out.println(raiz(2, 16));
        System.out.println(raiz(3, 27));
        System.out.println(raiz(4, 100_000_000));
        System.out.println(raiz(2, 1024));
    }
}
