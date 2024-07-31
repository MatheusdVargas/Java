package trabalho1;

public class fatorial {
        public static long fatorial(int num) {
            if ( num <= 1) {
                return 1;
            } else {
                long produto = 1;
                for (int i = num; i > 1; i--) {
                    produto = produto * i;
                }
                return produto;
            }
        }
        public static void main(String[] args) {
           System.out.println(fatorial(7));
        }  
}
