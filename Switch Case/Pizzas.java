import java.util.Scanner;

public class Pizzas {
    public static void main (String [] args) {
        System.out.println("Existem 5 tamanhos de pizza: \n 1- Pequena \n 2- Media \n 3- Grande \n 4- Super \n 5- Familia ");
        Scanner leitor = new Scanner(System.in);
        System.out.print("Que tamanho voce deseja? ");
        int tamanho = leitor.nextInt();
        switch (tamanho) {
            case 1 :
            case 2 :
                System.out.println("So pode ser escolhido 1 sabor");
	break;
            case 3 :
                System.out.println("So é possivel escolher 3 sabores");
	break;
            case 4 :
                System.out.println("So se pode escolher 4 sabores");
	break;
            case 5 :
                System.out.println("E possivel escolher 5 sabores");
                    break;
            default :
                    System.out.println("Ensira um valor valido");
	}
    }
}
