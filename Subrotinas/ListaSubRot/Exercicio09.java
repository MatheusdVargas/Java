
import java.util.Scanner;

/*
Escreva um novo programa, alterando o exercício 8, e pesquise quantos números dos 7 do
primeiro vetor são iguais a algum dos 6 números do segundo vetor.
 */

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int lista[] = new int[7];
        int lista2[] = new int[6];
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
        for(int i = 0; i < 6; i++) {
            int numero = leitor.nextInt();
            if(numero >= 1 && numero <= 99) {
                lista2[i] = numero;
            } else {
                if(numero > 99 || numero < 1) {
                    System.out.println("Valor Invalido");
                }
            }
        }
        int contador=0;
        for(int i =0; i< lista.length; i++){
            for(int j = 0; j < lista2.length; j++) {
          if(lista[i] == lista2[j])
              contador++;
            }
        }
    }
    
}
