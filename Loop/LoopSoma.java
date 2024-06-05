import java.util.Scanner;
public class LoopSoma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 10 numeros para serem somados: ");
        int num, total = 0;
        for (int cont = 1; cont <= 10; cont++) {
            num = leitor.nextInt();
            total = total + num;
        }
        System.out.println("Soma: " +  total);
    }
}