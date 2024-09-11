/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package conjuntos;
import java.util.Set; //interface 
import java.util.HashSet; // classe
import java.util.LinkedHashSet; // classe
import java.util.TreeSet; // classe
public class Conjuntos {
    public static void main(String[] args) {
        Set <String> JF = new TreeSet();
        JF.add("Debora Lima");
        JF.add("Adriana");
        JF.add("Raquel Martins");
        JF.add("Debora Magaldi");
        for(String elemento : JF) {
            System.out.println(elemento);
        }
        
        Set <String> TG = new HashSet();
        TG.add("Fabiana");
        TG.add("Debora Lima");
        TG.add("Fernanda");
        for(String elemento : TG) {
            System.out.println(elemento);
        }
        
        Set <String> GE = new HashSet();
        GE.add("Fernanda");
        GE.add("Fabiana");
        for(String elemento : GE) {
            System.out.println(elemento);
        }
        
        Set <String> tr = new LinkedHashSet();
        tr.add("Raquel Martins");
        tr.add("Raquel");
        tr.add("Marta");
        for(String elemento : tr) {
            System.out.println(elemento);
        }
        
        // dados que serao utilizados nas operacoes de conujunto
        Set <String> GEuJF = new HashSet(); // uniao
        Set <String> JFitr = new HashSet(); // interseção
        boolean GEctr; // esta contido
        Set <String> TG_GE = new HashSet(); // diferenca
        Set <String> TGdsJF = new HashSet(); // diferenca simetrica
        
        // uniao de dói conjuntos
        GEuJF.addAll(GE);
        GEuJF.addAll(JF);
        for(String elemento : GEuJF) {
            System.out.println("\n" +elemento);
        }
        
        // interseção
        System.out.println("\nIntersecao");
        JFitr.addAll(JF);
        JFitr.retainAll(tr);
        for(String elemento : JFitr) {
            System.out.println(elemento);
        }
        
        // esta contido
        System.out.println("Esta contido?");
        boolean GEcTG = TG.containsAll(GE);
        System.out.println(GEcTG);
        
        // diferenca
        System.out.println("Diferenca");
        TG_GE.addAll(TG);
        Set <String> temp = new HashSet();
        temp.addAll(TG);
        temp.retainAll(GE);
        
        TG_GE.removeAll(temp);
        
        for(String elemento : TG_GE) {
            System.out.println(elemento);
        }
        
        // diferenca simetrica
        System.out.println("");
        System.out.println("Diferenca simetrica");
        TGdsJF.addAll(TG);
        TGdsJF.addAll(JF);
        
        Set <String> temp2 = new HashSet();
        
        temp2.addAll(TG);
        temp2.retainAll(JF);
        
        TGdsJF.removeAll(temp2);
        
        for(String elemento : TGdsJF) {
            System.out.println(elemento);
        }
    }
}