package java1tri.Leitura;

import java.util.Scanner;
public class hipotenusa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o tamanho, em metros, do primeiro predio? ");
        double predio1 = leitor.nextDouble();
        System.out.println("Qual o tamanho, em metros, do segundo predio? ");
        double predio2 = leitor.nextDouble();
        System.out.println("Qual e a distancia entre os dois predios?");
        double dist = leitor.nextDouble();
        double altura = predio2 - predio1;
        double alturaquadrado = Math.pow(altura, 2);
        double distquadrado = Math.pow(dist, 2);
        double hip = Math.sqrt(alturaquadrado + distquadrado);
        System.out.println("A tirolesa tera: " + hip + " metros de comprimento");
    }
}