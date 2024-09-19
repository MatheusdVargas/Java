public class QuickSort {
    public static int partition(int vetor[], int inicio, int fim) {
            int pivo = vetor[fim];
            int q = inicio-1;
            int r;
            
            for(r = inicio; r < fim; r++) {
                if(vetor[r] <= pivo) {
                    q++;
                    int temp = vetor[q];
                    vetor[q] = vetor[r];
                    vetor[r] = temp;
                }
            }
            int temp = vetor[fim];
            vetor[fim] = vetor[q+1];
            vetor[q+1] = temp;
            return q+1;
    }
    public static void sort(int vetor[], int inicio, int fim) {
        if(inicio < fim) {
            int meio = partition(vetor, inicio, fim);
            sort(vetor, inicio, meio -1);
            sort(vetor, meio+1, fim);
        }
    }
    public static void main(String[] args) {
        int numeros[] = GeradorAleatorio.geraInt(20, 0, 1000);
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("");
        
        QuickSort.sort(numeros, 0, numeros.length -1);
        
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
}
