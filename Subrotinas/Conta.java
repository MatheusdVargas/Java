/*

 */
package subrotinas;
public class Conta {
    private static int quantContas = 0; 
    // Atributo
    private double saldo;
    
    public Conta() {
        quantContas++;
    }
    public static int getquantContas() {
        return quantContas;
    }
    // Metodo : saque
    // Parametro: valor (informação de entrada)
    // Retorno (tipo): boolean (informação de saida)
    public boolean saque(double valor) {
        boolean resultado = (valor > 0) && (valor <= saldo);
        if(resultado) {
            saldo -= valor;
        }
        
        return resultado;
    }
    // Metodo: deposito
    // Parametro: valor
    // Retorno: boolean
    public boolean deposito(double valor) {
        boolean resultado = (valor > 0 );
        if (resultado) {
            saldo += valor;
        }
        return resultado;
    }
    // Metodo: getSaldo
    // Parametro: n/a
    // Retorno: double
    public double getSaldo() {
        return this.saldo;
    }
}
