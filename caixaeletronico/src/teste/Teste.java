
package teste;

import modelo.Agencia;
import modelo.Banco;
import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.IBanco;


public class Teste {
    public static void main(String[] args) {
        IBanco itau = new Banco();
        Agencia ag1=new Agencia("Raquel",256);
        Agencia ag2=new Agencia("Dimitrius",238);
        itau.adicionaAgencia(ag1);
        itau.adicionaAgencia(ag2);
        
        Cliente pedro=new Cliente("pedro Kislansky","78675656");
        Cliente sara=new Cliente("Sara Zilansky","111111111");
        
        Conta cta1 = new ContaCorrente(111,pedro);
        Conta cta2 = new ContaPoupanca(222,sara);
        
        itau.adicionaConta(ag1, cta1);
        itau.adicionaConta(ag1, cta2);
        
        itau.transferir(cta1, cta2, 250);
        
        itau.imprimirContas();
        //itau.imprimirConta(222);
        //System.out.println("--------------");
        //System.out.println("toString: "+cta1.toString());
        //itau.imprimirContas(ag1);
        
        /*System.out.println(itau.depositar(cta1, 10000));
        System.out.println(itau.retirar(cta1, 1500));
        System.out.println(itau.retirar(cta1, 11500));*/
        
        
        
    }
}
