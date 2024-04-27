import java.util.Scanner;

public class ExCondicionais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = ler.nextInt();
        int divi3 = num % 3;
        int divi5 = num % 5;
        int divi7 = num % 7;
        if (divi3 == 0) {
            System.out.println("O numero e multiplo de 3");
        }
            if (divi5 == 0){
                System.out.println("O numero e multiplo de 5");
           }
                if (divi7 == 0){
                    System.out.println("O numero e multiplo de 7");
        }
                else 
                    System.out.print("O numero nao e multiplo de 3 ou 5 ou 7");
    }
}
