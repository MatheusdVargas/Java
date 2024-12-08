import java.util.Scanner;
public class Certificado {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas aulas tiveram? ");
        int aulasdadas = leitor.nextInt();
        System.out.println("Quantas aulas voce comprareceu? ");
        int presença = leitor.nextInt();
        double frequencia = (presença / (double)aulasdadas);
        if (frequencia >= 0.75 ) {
            System.out.println("Certificado liberado");
        } else {
            System.out.println("Certificado negado");
        }
    }
}
