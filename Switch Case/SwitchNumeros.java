package java1tri.Switch;
import java.util.Scanner;

public class SwitchNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor");
        int a = leitor.nextInt();
        System.out.println("Digite um valor");
        int b = leitor.nextInt();
        System.out.println("Digite um valor");
        int c = leitor.nextInt();
        System.out.println("Digite um valor");
        int d = leitor.nextInt();
        if (b > c && d > a && (c + d) > (a + b) && c > 0 && b > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores nao aceito");
        }
    }
}
