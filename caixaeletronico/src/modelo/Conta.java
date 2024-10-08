  
package modelo;

public abstract class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.setSaldoInicial();
    }

    public abstract void setSaldoInicial();
    
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
        return "Númro: "+this.getNumero()+" Cliente: "+this.getCliente().getNome()+" Saldo: "+this.getSaldo();
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
        if(this.getSaldo()>valor){
            this.setSaldo(saldo-valor);
            return "Valor retirado com sucesso";
        }else{
            return "Saldo insuficiente";       
        }
    }
    
}
