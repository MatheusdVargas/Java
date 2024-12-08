import java.util.Scanner;
public class SomatorioIndefinido {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valorAtual;
        double soma = 0.0, maximo, minimo, media;
        int quantidade =0;
        valorAtual = maximo = minimo = leitor.nextDouble();
        while (valorAtual != 0) {
            quantidade++;
            soma = soma + valorAtual;
            if (valorAtual > maximo) {
                maximo = valorAtual;
            } else {
                if (valorAtual < minimo) {
                    minimo = valorAtual;
                }
            }
            valorAtual = leitor.nextDouble();
        } if (quantidade != 0) {
            media = soma / quantidade;
            System.out.println("Somatorio: " + soma);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Media: "  + media);
            System.out.println("Maximo: " + maximo);
            System.out.println("Minimo: " + minimo);
        }
    } 
}
