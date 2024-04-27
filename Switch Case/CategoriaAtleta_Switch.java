import java.util.Scanner;

public class CategoriaAtleta_Switch {
        public static void main(String[] args ) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Ano de nascimento: ");
        int ano = leitor.nextInt();
        
       switch (ano) {
           case 2007 :
           case 2008 :
           case 2009 :      
               System.out.println("Categoria Juvenil");
               break;
           case 2010 :
           case 2011 :
           case 2012 :
               System.out.println("SUB-15");
               break;
           case 2013 :
           case 2014 :
               System.out.println("SUB-12");
               break;
           default :
               System.out.println("Inscricao Invalida");
       }
    }
}
