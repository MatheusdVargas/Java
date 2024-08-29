/*

 */
package fila;
import java.util.LinkedList;
public class Fila {

    public static void main(String[] args) {
        LinkedList <Double> fila = new LinkedList();
        
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        
        fila.offer(10.5);
        fila.offer(37.6);
        fila.offer(98.13);
        
        
        System.out.println(fila.size());
        System.out.println(fila.peek());
        System.out.println(fila.size());
        
        
        System.out.println(fila.poll()); // tira o 10.5
        System.out.println(fila.poll()); // tira 37.6
        
        System.out.println(fila.size());
    }
    
}
