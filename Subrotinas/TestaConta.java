/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subrotinas;

public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        System.out.println("Saldo: " + minhaConta.getSaldo() );
        System.out.println(minhaConta.saque(50.0));
        System.out.println(minhaConta.deposito(-50.0));
        System.out.println(minhaConta.deposito(50.0));
        System.out.println("Saldo: " + minhaConta.getSaldo());
        System.out.println(minhaConta.saque(34.0));
        System.out.println("Saldo: " + minhaConta.getSaldo());
        
        System.out.println(minhaConta.getquantContas());
        Conta outraConta = new Conta();
        Conta novaConta = new Conta();
        
        System.out.println(Conta.getquantContas());
    }
    
}
