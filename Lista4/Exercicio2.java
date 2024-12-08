/*
 Escreva um algoritmo que calcule os seguintes logaritmos:
 */
package listajava4;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio2 {
    public static void main(String[] args) {
        double logA = Math.log(1024) / Math.log(2);
        System.out.println("A - " + logA);
        double logB = Math.log(2187) / Math.log(3);
        System.out.println("B - " + logB);
        double logC = Math.log(390625) / Math.log(5);
        System.out.println("C - " + logC);
        double logD = Math.log(1.104622125) / Math.log(1.01);
        System.out.println("D - " + logD);
        double logE = Math.log(244.140625) / Math.log(2.5);
        System.out.println("E - " + logE);
    }
    
}
