package trabalho1;

public class equacao {
    public static double[] segundoGrau(double a, double b, double c) {
        a = 3;
        b= 1;
        c =3;
        
        if (a == 0) {
            System.out.println("Nao e uma equacao de segundo grau.");
            return null;
        } else {
            if (b == 0 || c == 0) {
                System.out.println("Equacao incompleta");
                return ;
            }

    } 
}
