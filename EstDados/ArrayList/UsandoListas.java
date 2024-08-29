/*

 */

package estruturadedados;
import java.util.ArrayList;
import java.util.Scanner;
public class UsandoListas {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        ArrayList <String> minhaLista = new ArrayList(); // cria a lista
        
        int numElementos = minhaLista.size(); // retorna o numero de elementos na lista
        System.out.println(numElementos);
        
        boolean estaVazia = minhaLista.isEmpty(); // retorna se a lista esta vazia
        System.out.println(estaVazia);
        
        minhaLista.add("banana"); // adiciona na lista (na ordem de incersçao)
        minhaLista.add("leite");
        minhaLista.add("pao");
        minhaLista.add("presunto");
        
        String elemento = minhaLista.get( 2 ); // pega a string de indice 2
        System.out.println(elemento);
        
        minhaLista.add(2, "desinfetante"); // muda indice 2 pela String
        elemento = minhaLista.get( 2 ); // pega a string de indice 2
        System.out.println(elemento); 
        
        boolean encontrou = minhaLista.contains("vassoura"); // verifica se ha vassoura na lista
        System.out.println(encontrou);
        
        encontrou = minhaLista.contains("leite"); // verifica se ha leite na lista
        System.out.println(encontrou);
        
        int indice = minhaLista.indexOf("presunto"); // verifica o indice de presunto
        System.out.println(indice);
        
        indice = minhaLista.indexOf("batata"); // verifica o indice de batata (nao existe)
        System.out.println(indice);
        
        boolean removeupao = minhaLista.remove("pao"); // remove a palavra pao da lista
        System.out.println(removeupao);
        elemento = minhaLista.get(3); // pega o item da posicao 3
        System.out.println(elemento);
        
        minhaLista.remove(1); // remove o item da posicao 1
        elemento = minhaLista.get(1); // pega o elemento 1 da lista
        System.out.println(elemento);
        
    }
    
}
