package arquivos;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
public class Tabulacao {
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
        for(int i = 0; i < codMatricula.size(); i++) {
            // d = inteiro decimal
            // f = float (numero com ponto)
            // 7/ 4/ 2 = numeros de digitos a imprimir
            // .1 = numero de casas apos a virgula
            System.out.printf( "%7d\t %4.1f\t %4.1f\t %2d\n", 
                    codMatricula.get(i),
                    notas1.get(i),
                    notas2.get(i),
                    faltas.get(i) );
        }
    }
    
}
