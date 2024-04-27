import java.util.Scanner;

public class Frequencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Aulas dadas: ");
        int aulas = leitor.nextInt();
        System.out.print("Numero de faltas: ");
        int faltas = leitor.nextInt();
        double frequencia = (aulas - faltas) / (double) aulas;
        if (frequencia >= 0.75) {
            System.out.println("Aprovado por frequencia");
        } else {
            System.out.println("Reprovado por frequencia");
        }
    }
}
