public class BubbleSort {
    public static void sort(int[] vetor) {
        // rodadas de comparacao
        for(int i = 0; i < vetor.length - 1; i++) {
            // sequencia de comparacao por rodadas
            for(int j = 0; j < vetor.length - i  -1; j++) {
                // comparacao para troca
                if (vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int numeros[] = GeradorAleatorio.geraInt(20, 0, 1000);
        
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        BubbleSort.sort(numeros);
        
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
}
