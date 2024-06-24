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
        char faixaEtaria;
        char timeTorcida;
        
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
            faixaEtaria = leitor.next().toUpperCase().charAt(0);
            // Unico jeito que encontrei de ler char
            if (faixaEtaria == 'X') {
                break;
            }

            System.out.println("Digite o time de torcida:\n[I] Internacional\n[G] Gremio");
            timeTorcida = leitor.next().toUpperCase().charAt(0);

            if (faixaEtaria == 'A') {
                totalA++;
                if (timeTorcida == 'G') {
                    adultosG++;
                } else if (timeTorcida == 'I') {
                    adultosCo++;
                }
            } else if (faixaEtaria == 'C') {
                totalC++;
                if (timeTorcida == 'G') {
                    criancasG++;
                } else if (timeTorcida == 'I') {
                    criancasCo++;
                }
            }

            if (timeTorcida == 'G') {
                totalG++;
            } else if (timeTorcida == 'I') {
                totalCo++;
            }
        }
        // contas
        int totalPessoas = totalA + totalC;
        double percentualAdultos = (totalA / (double) totalPessoas) * 100;
        double percentualCriancas = (totalC / (double) totalPessoas) * 100;
        double percentualGremistas = (totalG / (double) totalPessoas) * 100;
        double percentualColorados = (totalCo / (double) totalPessoas) * 100;

        System.out.println("Percentual de adultos: " + percentualAdultos);
        System.out.println("Percentual de criancas: " + percentualCriancas);
        System.out.println("Percentual de gremistas: " + percentualGremistas);
        System.out.println("Percentual de colorados: " + percentualColorados);

        
        double percentualAdultosGremistas = (adultosG / (double) totalA) * 100;
        double percentualAdultosColorados = (adultosCo / (double) totalA) * 100;
        System.out.println("Percentual de adultos gremistas: " + percentualAdultosGremistas);
        System.out.println("Percentual de adultos colorados: " + percentualAdultosColorados);



        double percentualCriancasGremistas = (criancasG / (double) totalC) * 100;
        double percentualCriancasColorados = (criancasCo / (double) totalC) * 100;
        System.out.println("Percentual de crianças gremistas: " + percentualCriancasGremistas);
        System.out.println("Percentual de crianças coloradas: " + percentualCriancasColorados);
            
        
    }   
}
