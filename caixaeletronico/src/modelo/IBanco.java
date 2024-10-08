
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
    public boolean autenticarCliente(int agencia,int conta,String senha);
    public boolean transferir(Conta origem,Conta destino,double valor);
}
