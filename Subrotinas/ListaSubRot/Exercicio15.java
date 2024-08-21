public class Exercicio15 {
    public static double somaRecursiva(double[] vetor, int indice) {
        if (indice == vetor.length) {
            return 0;
        }
        return vetor[indice] + somaRecursiva(vetor, indice + 1);
    }
}
