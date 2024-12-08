import java.util.Scanner;
public class LoopLeitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 10 números: ");
        for(int cont=1; cont<=10; cont++) {
            int num = leitor.nextInt();
            System.out.println(num*3);
        }
        }
}

