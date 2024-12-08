/*/*
 Escreva um programa que exiba todos os números primos menores que 100.
 */
package listajava3;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio5 {
    public static void main(String[] args) {
        for(int i = 2; i<=99; i++){
            
            int contadores = 0;
            
           for(int j = 1; j <= i; j++){
               
               if(i % j == 0){
                   contadores++;
               }
           }
           if(contadores == 2){
               System.out.println("Esse numero e primo: " + i);
           }
        }
    }    
}
