/*
Criar um método para calcular o n-ésimo número da série de Fibonacci.
A série inicia com os valores 1 e 1, e os números subsequentes
são a soma dos dois anteriores. (ex.: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...)
 */

public class fibonacci {
   public static void main(String[] args) {
        int n = 12; // 12 numero de fibonacci
        int resultado = calcular(n);
        System.out.println(resultado);
    }

    public static int calcular(int n) {
        int fib1 = 1, fib2 = 1, fibN = 1;
        // Formula: n = (n-1) + (n-2)
        // for começa em 3 pq os valores ja foram inicializados
        for (int i = 3; i <= n; i++) {
            fibN = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibN;
        }
        //nem eu entendi oque foi feito, mas ta funcionando
        return fibN;
    }
}
