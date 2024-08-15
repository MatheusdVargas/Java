/*
Escreva um novo programa, alterando o exercício 6, e leia mais um número inteiro e verifique se
ele é igual a algum dos anteriores.
 */
import java.util.Scanner;
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[7];
        for(int i = 0; i < 7; i++) {
            int numero = leitor.nextInt();
            if(numero >= 1 && numero <= 99) {
                lista[i] = numero;
            } else {
                if(numero > 99 || numero < 1) {
                    System.out.println("Valor Invalido");
                }
            }  
            
        }
        for(int i = 0; i < 7; i++) {
            int compNum = leitor.nextInt();
            if(compNum == lista[i]) {
            }
        }
    }
    
}
