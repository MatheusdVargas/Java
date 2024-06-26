/*
Implemente um algoritmo que leia um número indefinido de pares de informação, contendo faixa etária (‘A’ para
adulto e ‘C’ para criança) e time de torcida (‘G’ para Grêmio e ‘I’ para Internacional). O usuário vai informar a faixa
etária e depois o time, separadamente. Quando o usuário digitar ‘X’ para faixa etária, o programa deve encerrar e
informar o percentual de adultos e crianças, o percentual de gremistas e colorados, bem como o percentual de
adultos gremistas e adultos colorados (do total de adultos) e o percentual de crianças gremistas e crianças
coloradas (do total de crianças).
 */
package listajava3;
import java.util.Scanner;
/**
 *
 * @author Matheus de Vargas
 */
public class ExercicioDez {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String faixaEtaria;
        String timeTorcida;
        
        int totalA = 0;
        int totalC = 0;
        
        int totalG = 0;
        int totalCo = 0;
        
        int adultosG = 0;
        int adultosCo = 0;
        
        int criancasG = 0;
        int criancasCo = 0;
        
        while (true) {
            System.out.println("Digite a faixa etaria:\n[A] Adulto\n[C] Crianca ");
            faixaEtaria = leitor.next().toUpperCase();
            if ("X".equals(faixaEtaria)) {
                break;
            }

            System.out.println("Digite o time de torcida:\n[I] Internacional\n[G] Gremio");
            timeTorcida = leitor.next().toUpperCase();

            if ("A".equals(faixaEtaria)) {
                totalA++;
                if ("G".equals(timeTorcida)) {
                    adultosG++;
                } else if ("I".equals(timeTorcida)) {
                    adultosCo++;
                }
            } else if ("C".equals(faixaEtaria)) {
                totalC++;
                if ("G".equals(timeTorcida)) {
                    criancasG++;
                } else if ("I".equals(timeTorcida)) {
                    criancasCo++;
                }
            }

            if ("G".equals(timeTorcida)) {
                totalG++;
            } else if ("G".equals(timeTorcida)) {
                totalCo++;
            }
        }
        // contas
        int totalPessoas = totalA + totalC;
        double percentualAdultos = (totalA  * 100 /  (double) totalPessoas) ;
        double percentualCriancas = (totalC * 100/ (double) totalPessoas) ;
        double percentualGremistas = (totalG * 100/ (double) totalPessoas) ;
        double percentualColorados = (totalCo * 100/ (double) totalPessoas) ;

        System.out.println("Percentual de adultos: " + percentualAdultos);
        System.out.println("Percentual de criancas: " + percentualCriancas);
        System.out.println("Percentual de gremistas: " + percentualGremistas);
        System.out.println("Percentual de colorados: " + percentualColorados);
      
        double percentualAdultosGremistas = (adultosG * 100/ (double) totalA) ;
        double percentualAdultosColorados = (adultosCo * 100/ (double) totalA) ;
        System.out.println("Percentual de adultos gremistas: " + percentualAdultosGremistas);
        System.out.println("Percentual de adultos colorados: " + percentualAdultosColorados);

        double percentualCriancasGremistas = (criancasG * 100/ (double) totalC) ;
        double percentualCriancasColorados = (criancasCo * 100/ (double) totalC) ;
        System.out.println("Percentual de crianças gremistas: " + percentualCriancasGremistas);
        System.out.println("Percentual de crianças coloradas: " + percentualCriancasColorados);
    }   
}
