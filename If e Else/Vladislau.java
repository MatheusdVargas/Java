import java.util.Scanner;
public class Vladislau {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o total comprado? ");
        double valor = leitor.nextDouble();
        if (valor > 120) {
            System.out.println("Insento de imposto");
            System.out.println("Sua compra sera de" + valor);
        } else {
            System.out.println("Sera cobrado R$15,00 de frete");
            double valorfrete = valor +15;
            System.out.println("Sua compra sera de " + valorfrete);
        }
    }
}
