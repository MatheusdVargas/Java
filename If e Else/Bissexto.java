import java.util.Scanner;
public class Bissexto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um ano para saber se ele e bissexto: ");
        int ano = leitor.nextInt();
        if (ano % 4 == 0) {
            System.out.println("O ano e bissexto");
        } else {
            System.out.println("O ano nao e bissexto");
        }
    }
}
