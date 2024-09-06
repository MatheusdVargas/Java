/*
Escreva um programa que crie uma fila para armazenar pedidos de um restaurante. Os pedidos
podem ser “pizza salao”, “pizza delivery”, “sushi salao” e “sushi delivery”. Receba todos os
pedidos (serão um total de 20.). Em seguida, tire os pedidos da fila, e envie para outras duas
filas de preparo: pizza e sushi. Depois de alocar todos os pedidos nas filas de preparação, retire
delas e insira em novas duas filas de entrega: salao e delivery
 */
package listapilhaefila;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Queue<String> filaPedidos = new LinkedList<>();

        Queue<String> filaPizza = new LinkedList<>();
        Queue<String> filaSushi = new LinkedList<>();

        Queue<String> filaSalao = new LinkedList<>();
        Queue<String> filaDelivery = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            String pedido = leitor.nextLine();
            filaPedidos.add(pedido); 
        }

        while (!filaPedidos.isEmpty()) {
            String pedido = filaPedidos.remove();
            if (pedido.contains("pizza")) {
                filaPizza.add(pedido); 
            } else if (pedido.contains("sushi")) {
                filaSushi.add(pedido);
            }
        }

        while (!filaPizza.isEmpty()) {
            String pedidoPizza = filaPizza.remove(); 
            if (pedidoPizza.contains("salao")) {
                filaSalao.add(pedidoPizza); 
            } else if (pedidoPizza.contains("delivery")) {
                filaDelivery.add(pedidoPizza); 
            }
        }

        while (!filaSushi.isEmpty()) {
            String pedidoSushi = filaSushi.remove(); 
            if (pedidoSushi.contains("salao")) {
                filaSalao.add(pedidoSushi); 
            } else if (pedidoSushi.contains("delivery")) {
                filaDelivery.add(pedidoSushi); 
            }
        }

        System.out.println("Pedidos para entrega no salao:");
        while (!filaSalao.isEmpty()) {
            String pedido = filaSalao.remove(); 
            System.out.println(pedido); 
        }


        System.out.println("\nPedidos para entrega delivery:");
        while (!filaDelivery.isEmpty()) {
            String pedido = filaDelivery.remove();
            System.out.println(pedido); 
        }
    }
    
}
