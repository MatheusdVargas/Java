package execoes;
public class execaoNaoVerificada {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        try {
            for(int i = 0; i <= 10; i++) { // index out of bounds
            vetor[i] = i * 2;
            
            } 
        } catch (IndexOutOfBoundsException exc) {
            // sem nada aqui = mascarar
            
            //marcar
            System.err.println("Verificar onde esta errado");
            
            // mostrar o processo do erro
            exc.printStackTrace();
        }
        System.out.println("Programa OK");
        
    }   
}
