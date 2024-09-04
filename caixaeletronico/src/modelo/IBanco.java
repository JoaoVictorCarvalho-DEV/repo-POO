
package modelo;

public interface IBanco {
    public void adicionaAgencia(Agencia agencia);
    public void imprimirAgencias();
    public void imprimirAgencia(int numero);
    public void adicionaConta(Agencia ag,Conta cta);
    public void imprimirContas();
    public void imprimirContas(Agencia ag);
    public void imprimirConta(int numero);
    public boolean depositar(Conta conta,double valor);
    public String retirar(Conta conta,double valor);
}
