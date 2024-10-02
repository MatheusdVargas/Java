package arquivos;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
public class EscritaArquivoFormatado {
    public static void main(String[] args) {
        File arqLeitura = new File("notas.txt");
        Scanner leitor = null;
        ArrayList <Integer> codMatricula = new ArrayList();
        ArrayList <Double> notas1 = new ArrayList();
        ArrayList <Double> notas2 = new ArrayList();
        ArrayList <Integer> faltas = new ArrayList();

        try {
            leitor = new Scanner(arqLeitura);
            
            while(leitor.hasNext()) {
                codMatricula.add(leitor.nextInt());
                notas1.add(leitor.nextDouble());
                notas2.add(leitor.nextDouble());
                faltas.add(leitor.nextInt());
            }
            System.out.println(codMatricula.size());
        } catch(FileNotFoundException exc) {
            exc.printStackTrace();
        } finally {
            if(leitor !=null) {
                leitor.close();
            }
          }
        
        ArrayList <Double> medias = new ArrayList();
        for(int i = 0; i <notas1.size(); i++) {
            double media  = (notas1.get(i) + notas2.get(i)) / 2;
            medias.add(media);
        }
        
        File arqSaida = new File("medias.txt");
        PrintWriter escritor = null;
        
        try {
            escritor = new PrintWriter(arqSaida);
            for(int i = 0; i < codMatricula.size(); i++) {
            escritor.printf( "%7d %4.1f %4.1f %2d %4.1f\n", 
                    codMatricula.get(i),
                    notas1.get(i),
                    notas2.get(i),
                    faltas.get(i),
                    medias.get(i));
        }
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } finally {
            if(escritor != null) {
                escritor.close();
            }
        }
        
        
    }
    
}
