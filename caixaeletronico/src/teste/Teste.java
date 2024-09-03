
package teste;

import modelo.Agencia;
import modelo.Banco;
import modelo.Cliente;
import modelo.Conta;
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
        
        Conta cta1 = new Conta(111,pedro);
        Conta cta2 = new Conta(222,sara);
        
        itau.adicionaConta(ag1, cta1);
        itau.adicionaConta(ag1, cta2);
        
        itau.imprimirContas(ag1);
        
        
    }
}
