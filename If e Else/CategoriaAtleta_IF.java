import java.util.Scanner;
public class CategoriaAtleta_IF {
    public static void main(String[] args ) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Ano de nascimento: ");
        int ano = leitor.nextInt();
        
        if (ano == 2007 || ano == 2008 || ano == 2009) {
            System.out.println("Categoria Juvenil");
        } else if (ano == 2010 || ano == 2011 || ano == 2012){
                System.out.println("Categoria sub-15");
        }  else  if (ano == 2013 || ano == 2014)  {        
                System.out.println("Categoria sub-12");
                } else {
                System.out.println("Idade ");
                }
                }
    }

