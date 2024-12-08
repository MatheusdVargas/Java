package buscas;

public class Buscas2 {
    public static void main(String[] args) {
        int v[] = new int[100_000];
        
        for(int i = 0; i < v.length; i++) {
            double aleatorio = Math.ceil(Math.random() * 1_000_000);
            int num = (int)aleatorio;
            v[i] = num;
        }
    }  
}
