/*
Escreva um método recursivo que calcule a potência X^N. 
Nesse exemplo, X é um valor real e N é um valor inteiro.
Ambos são passados como parâmetros de entrada do método.
*/
public class Exercicio14 {
    public static double potenciaRecursiva(double X, int N) {
        // elevado a 0
        if (N == 0) {
            return 1;
        }
        // expoente negativo
        if (N < 0) {
            return 1 / potenciaRecursiva(X, -N);
        }
        // Recusrtivo
        return X * potenciaRecursiva(X, N - 1);
    }
}