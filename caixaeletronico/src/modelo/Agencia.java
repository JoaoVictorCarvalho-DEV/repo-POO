
package modelo;

import java.util.ArrayList;


public class Agencia {
    private String gerente;
    private int numero;
    private String endereco;
    ArrayList<Conta> contas;

    public Agencia(){
        contas=new ArrayList<>();
    }
    
    public Agencia(int numero){
        this.numero=numero;
        contas=new ArrayList<>();
    }
    
    public Agencia(String gerente,int numero){
        this.gerente=gerente;
        this.numero=numero;
        contas=new ArrayList<>();
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    
    public void add(Conta conta){
        this.contas.add(conta);
    }
    
    public void imprimirContas(){
        for(Conta conta:this.contas){
            System.out.println(conta.toString());
            System.out.println("=============");
        }
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
    
    public boolean contaExiste(int numero){
        boolean resposta =false;
        for(Conta conta: this.contas){
            if(conta.getNumero()==numero){
                resposta=true;
                break;
            }
        }
        return resposta;
    }
}
