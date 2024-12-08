/*
Um lago foi infestado por um tipo de alga em que cada “indivíduo” tem cerca de 20 cm2. 
A superfície do lago tem aproximadamente 500 m2(equivalente a 5.000.000 cm2).
Essa alga duplica a cada 5 dias. Se não for feito nada para removê-la,
em quantos dias ela irá cobrir todo o lago?
 */
package listajava3;
/**
 *
 * @author Matheus de Vargas
 */
public class Exercicio6 {
    public static void main(String[] args) {
        int alga = 20;
        int lago = 5000000;
        int dias = 0;
        do {
            alga = alga * 2;
            dias += 5;
        } while (lago >= alga);
        System.out.println("Dias: " + dias);
    }
    
}
