package java1tri.If;
import java.util.Scanner;

public class Equacao2grau {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o valor de a: ");
        int a = leitor.nextInt();
            System.out.print("Digite o valor de b: ");
        int b = leitor.nextInt();
            System.out.print("Digite o valor de c: ");
        int c = leitor.nextInt();
        if (a == 0) {
            System.out.println("Nao e uma equacao de segundo grau.");
            return;
        } else {
            if (b == 0 || c == 0) {
                System.out.println("Equacao incompleta");
            }
        }
        double delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("O delta tem o valor de " + delta);
        if (delta < 0) {
            System.out.println("Nao ha raizes para a equacao");
        } else {
            if (delta == 0) {
                System.out.println("Essa equacao tem uma raiz");
                double raiz1 = (-b) / 2 * a;
                System.out.println("Essa raiz é: " + raiz1);
            } else {
                System.out.println("Essa equcao tem duas raizes");
                double raiz = (-(b) + Math.sqrt(delta)) / 2 * a;
                double raiz2 = (-(b) - Math.sqrt(delta)) / 2 * a;
                System.out.println("Raiz 1 = " + raiz);
                System.out.println("Raiz 2 = " + raiz2);
            }
        }
    }
}
