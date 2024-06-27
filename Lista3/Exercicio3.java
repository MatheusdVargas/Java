/*
Você deve escrever um programa que exiba uma saída como aparece no exemplo abaixo.
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?
 */
package listajava3;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio3 {
    public static void main(String[] args) {
        
        for (double i = 0; i <= 2; i += 0.2) {
            for (double  j = i + 1; j <= 3 + i; j += 1.0) {
                System.out.println("I: " + i + " J:" + j);
            }
        }
    }
    
}
