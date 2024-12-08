import java.util.Scanner;
public class Circulos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = leitor.nextInt();
        double perimetro = 2 * Math.PI * raio ;
        
        double area = Math.PI * Math.pow(raio, 2);
        double volume = 4/3 * Math.PI * Math.pow(raio, 3);
        double superficie = 4 * Math.PI * Math.pow(raio, 2);
        
        System.out.println(perimetro);
        System.out.println(area);
        System.out.println(volume);
        System.out.println(superficie);
    }   
}
