
package modelo;


public class Agencia {
    private String gerente;
    private int numero;
    private String endereco;

    public Agencia(){
        
    }
    
    public Agencia(int numero){
        this.numero=numero;
    }
    
    public Agencia(String gerente,int numero){
        this.gerente=gerente;
        this.numero=numero;
    }
    
    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
