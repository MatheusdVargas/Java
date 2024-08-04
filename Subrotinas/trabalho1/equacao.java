/*
Criar um método para calcular as raízes reais de uma equação do 2º grau. - feito
Os parâmetros de entrada são os coeficientes a, b e c. - feito
O retorno é um array contendo as duas raízes (se houver apenas 1 raiz, o array terá 1 posição;
se não houver raiz, retornar null) - feito
 */
package trabalho1;

public class bhaskara {
    public static void main(String[] args) {
        double[] raizes = calcularRaizes(1, -3, 2); 
        // a = calcularRaizes[0]  b = calcularRaizes[1]  c = calcularRaizes[2]
        if (raizes == null) {
            System.out.println("Não há raízes para essa equacao");
        } else {
            if(raizes.length == 1) {
                System.out.println("Há apenas 1 raiz para essa equacao");
                System.out.println("Raiz = " + raizes[0]);
            } else {
                if(raizes.length == 2) {
                    System.out.println("Há 2 raizes para essa equacao");
                    System.out.println("Raiz 1 = " + raizes[0] + " Raiz 2 = " + raizes[1]);
                }
            }
        }
    }

    public static double[] calcularRaizes(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        // Sem raiz
        if (delta < 0) {
            return null;
        // Ujma raiz
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            return new double[]{raiz};
        // Duas raizes
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{raiz1, raiz2};
        }
    }
}
