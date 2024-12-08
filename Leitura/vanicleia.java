import java.util.Scanner;

public class vanicleia {
    public static void main(String[] args) {
        Scanner quant_pessoas = new Scanner(System.in);
        System.out.print("Quantas pessoas participarao do PL?");
        int pessoas = quant_pessoas.nextInt(); 
        double linguiça = (pessoas * 0.63);
        int pao = pessoas * 2;
        double refri = (int) Math.ceil(pessoas * 0.5);
        double carvao = (int) Math.ceil(linguiça * 1.5); 
        System.out.println("Sera necessario no comprar: ");
        System.out.println( linguiça + " kg de linguiça");
        System.out.println( pao + " paes");
        System.out.println( refri + " garrafas de refrigerante");
        System.out.println( carvao + " kg de carvao");
    }
}
