
package modelo;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString(){
        return "Númro: "+this.getNumero()+" Cliente: "+this.getCliente().getNome();
    }
    
    public boolean depositar(double valor){
        if(valor>0){
            this.saldo=this.saldo+valor;
            return true;
        }else{
            return false;
        }
    }
    
    public String retirar(double valor){
        if(valor>(this.saldo+this.limite)){
            return "Saldo insuficiente";
        }else{
            return "Valor retirado com sucesso";
        }
    }
    
}
