package arquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex01b {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        ArrayList <String> produtos = new ArrayList();
        ArrayList <Integer> quantProd = new ArrayList();
        ArrayList <Double> valProd = new ArrayList();
        ArrayList <Double> totProd = new ArrayList();
        
        int totalItens = 0;
        double totCompra = 0.0;
        System.out.println("Descricao: ");
        String descricao = leitor.nextLine();
        while(!descricao.equals("fim")) {
            System.out.println("Quantidade: ");
            int quantidade = leitor.nextInt();
            System.out.println("Valor: ");
            double valorUnit = leitor.nextDouble();
            double valor = quantidade * valorUnit;
            
            produtos.add(descricao);
            quantProd.add(quantidade);
            valProd.add(valorUnit);
            totProd.add(valor);
            
            totalItens += quantidade;
            totCompra += valor;
            
            leitor.nextLine();
            System.out.println("Descricao: ");
            descricao = leitor.nextLine();
        }
        File registroCompra = new File ("produtos.txt");
                PrintWriter escritor = null;
                
        try {
            escritor = new PrintWriter (registroCompra);
            for(int i = 0; i < produtos.size(); i++) {
                escritor.printf("%-20s %3d %,8.2f %,9.2f\n",
                produtos.get(i),
                quantProd.get(i),
                valProd.get(i),
                totProd.get(i));
            }
            escritor.printf("%4d itens\n", totalItens);
            escritor.printf("Total: R$ %,9.2f\n", totCompra);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        } finally {
            if(escritor != null) {
                escritor.close();
            }
        }
    }
    
}
