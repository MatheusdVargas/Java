public class GeradorAleatorio {
    public static int[] geraInt(int tamanho, int minimo, int maximo) {
        if (tamanho > 0 && minimo < maximo) {
            int[] saida = new int[tamanho];

            for(int i=0; i < tamanho; i++) {
                saida[i] = (int) Math.rint( Math.random() * (maximo-minimo) + minimo);
            }
            return saida;
        } else {
            return null;
        }
    }

    public static double[] geraDouble(int tamanho, double minimo, double maximo) {
        if (tamanho > 0 && minimo < maximo) {
            double[] saida = new double[tamanho];

            for(int i=0; i < tamanho; i++) {
                saida[i] = Math.random() * (maximo-minimo) + minimo;
            }
            return saida;
        } else {
            return null;
        }
    }

}
