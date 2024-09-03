
package teste;

import modelo.Agencia;
import modelo.Banco;
import modelo.IBanco;


public class Teste {
    public static void main(String[] args) {
        IBanco itau = new Banco();
        Agencia ag1=new Agencia("Raquel",256);
        Agencia ag2=new Agencia("Dimitrius",238);
        Agencia ag3=new Agencia("Pedro",152);
        itau.adicionaAgencia(ag1);
        itau.adicionaAgencia(ag2);
        itau.adicionaAgencia(ag3);
        itau.imprimirAgencias();
        itau.imprimirAgencia(238);
        
    }
}
