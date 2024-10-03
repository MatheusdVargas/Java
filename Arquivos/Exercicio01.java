package arquivos;
/*
Nicolas olhar pra tras que eu vou copiar do chatgpt (ele nunca mais olhou pra frente).
*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter arqLeitura = new FileWriter("produtos.txt");
             PrintWriter arqPrint = new PrintWriter(arqLeitura)) {

            int totalQuantidade = 0;
            double totalValor = 0.0;

            while (true) {
                System.out.println("Digite a descrição do produto:");
                String nome = scanner.nextLine();
                
                if (nome.equals("fim")) {
                    break;
                }

                System.out.println("Digite a quantidade do produto:");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite o valor unitário do produto:");
                double valorUnitario = Double.parseDouble(scanner.nextLine());

                double valorTotalProduto = quantidade * valorUnitario;

                arqPrint.printf("%s\t%d\t%.2f%n", 
                        nome, 
                        quantidade, 
                        valorUnitario);
                
                totalQuantidade += quantidade;
                totalValor += valorTotalProduto;
            }

            arqPrint.printf("Total de produtos: %d%n", totalQuantidade);
            arqPrint.printf("Valor total: %.2f%n", totalValor);

        } catch (IOException e) {
            System.out.println("Ocorreu um erro " + e.getMessage());
        }
        scanner.close();
    }
}
