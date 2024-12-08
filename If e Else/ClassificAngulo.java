import java.util.Scanner;
public class ClassificAngulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o angulo: ");
        double angulo = leitor.nextDouble();
        if (angulo == 90) {
            System.out.println("Angulo reto");
        } else {
            if (angulo > 90){
                System.out.println("Angulo obtuso");
            } else {
                System.out.println("Angulo agudo");
            }
        }
    }
}