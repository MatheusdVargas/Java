package execoes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class arquivos {
    public static void main(String[] args) {
        File arquivo = new File("cursos.txt ");
        
        Scanner leitura = null;
        try {
            leitura = new Scanner(arquivo);
        } catch (FileNotFoundException exc) {
            System.err.println("Nao consigo abrir essa merda");
        }
        // se conseguir achar o achar o arquivo nao vai ser null
        if (leitura != null) {
            while (leitura.hasNext()) {
                System.out.println( leitura.nextLine() );
            }
        }
    }
    
}
