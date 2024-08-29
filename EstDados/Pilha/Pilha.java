package pilha;
import java.util.Stack;
public class Pilha {

    public static void main(String[] args) {
        Stack < String > pilha = new Stack();
        // adicionar elementos na lista
        pilha.push("banana");
        pilha.push("manga");
        pilha.push("sapoti");
        pilha.push("maca");
        
        // mostrar tamanho da lista 
        // mostrar se a lista esta vazia
        System.out.println(pilha.size());
        System.out.println(pilha.isEmpty());
        
        // olha o ultimo elemento da lista
        System.out.println(pilha.peek());
        
        // excluir da lista
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        
        // mostrar o tamanho da pilha
        System.out.println(pilha.size());
    }   
}