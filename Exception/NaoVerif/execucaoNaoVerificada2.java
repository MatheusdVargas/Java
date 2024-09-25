package execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class execucaoNaoVerificada2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[10];

        // Preenchendo o vetor com valores
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        } 

        int valor = 0; 
        boolean digitacaoOk; 

        do {
            System.out.print("Digite um número: ");
            try {
                valor = leitor.nextInt(); 
                digitacaoOk = true; 
            } catch (InputMismatchException exc) {
                digitacaoOk = false; 
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                leitor.nextLine(); 
            }
        } while (!digitacaoOk); 

        System.out.println("Programa OK");
    }   
}
