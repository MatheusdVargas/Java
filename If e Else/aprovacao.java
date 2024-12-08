import java.util.Scanner;

public class aprovacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Aulas dadas: ");
        int aulas = leitor.nextInt();
        System.out.print("Numero de faltas: ");
        int faltas = leitor.nextInt();
        double frequencia = (aulas - faltas) / (double) aulas;
        System.out.print("Digite sua primeira nota: ");
        double nota1 = leitor.nextInt();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = leitor.nextInt();
        System.out.print("Digite sua terceira nota: ");
        double nota3 = leitor.nextInt();
        double media = (nota1 + nota2 + nota3) /3;
        if (frequencia >= 0.75) {
            System.out.println("Aprovado por frequencia");
            if (media >= 7.0) {
                System.out.println("Aprovado por nota");
            } else {
                if (media < 1.8) {
                System.out.println("Reprovado por nota");
                } else {
                    System.out.println("Em exame");
                }
            }
        } else {
            System.out.println("Reprovado por frequencia");
        }
    }
}
