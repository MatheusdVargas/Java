/*
 Escreva um algoritmo que calcule e exiba o resultado das seguintes expressões algébricas, sem
simplifica-las previamente:
 */
package listajava4;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println(Math.pow(9, 3));
        System.out.println(Math.pow(7, 5));
        System.out.println(Math.pow(3, 9) + Math.pow(2, 10));
        System.out.println(Math.pow(5, 4) - Math.pow(6, 2));
        double numE  = Math.pow(5, 2);
        System.out.println(Math.pow(numE, 3));
        double numF = Math.pow(2, 7) - Math.pow(3, 4);
        System.out.println(Math.cbrt(numF));
        double numG = Math.pow(9, 7) * Math.pow(4, 3);
        System.out.println(Math.pow(numG, 1.0/5);
        double numH = Math.pow(2, 5) / Math.pow(5, 2);
        System.out.println(Math.pow(numH, 1.0/4));
    }
    
}
