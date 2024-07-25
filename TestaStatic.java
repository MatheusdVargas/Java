/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subrotinas;

import java.util.Scanner;
public class TestaStatic {
    private static Scanner leitor = new Scanner(System.in);
    private static int valor1, valor2;
    private static int soma, diferenca, produto, quociente;
    public static void leitura() {
        // Entrada
        System.out.println("Digite o primeiro valor: ");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = leitor.nextInt();
    }
    public static void processamento() {
        // Operações
        soma = valor1 + valor2;
        diferenca = valor1 - valor2;
        produto = valor1 * valor2;
        quociente = valor1 / valor2;
    }
    public static void saida() {
        // Saida
        System.out.println("Soma: " + soma);
        System.out.println("Diferenca: " + diferenca);
        System.out.println("Produto: " + produto);
        System.out.println("Quociente: " + quociente);
    }
    public static void main(String[] args) {
        leitura();
        processamento();
        saida();
    }
}
