
package modelo;

import java.util.ArrayList;

public class Banco implements IBanco{
    private String nome;
    private ArrayList<Agencia> agencias;
    
    public Banco(){
        this.agencias=new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public void adicionaAgencia(Agencia agencia){
        System.out.println("Adicionando Agencia: "+agencia.getNumero());
        this.agencias.add(agencia);
    }
    
    @Override
    public void imprimirAgencias(){
        for(int i=0;i<this.agencias.size();i++){
            System.out.println("Gerente: "+this.agencias.get(i).getGerente());
            System.out.println("Número: "+this.agencias.get(i).getNumero());
            System.out.println("\n==============\n");
        }
    }

    @Override
    public void imprimirAgencia(int numero) {
        for(int i=0;i<this.agencias.size();i++){
            if(numero==this.agencias.get(i).getNumero()){
                System.out.println("\n*************\n");
                System.out.println("Gerente: "+this.agencias.get(i).getGerente());
                System.out.println("Número: "+this.agencias.get(i).getNumero());
                System.out.println("\n*************\n");
            }
        }
    }

    public void adicionaConta(Agencia agencia, Conta conta) {
        agencia.add(conta);
    }
    
    public void imprimirContas() {
        for(Agencia agencia: this.agencias){
            agencia.imprimirContas();
        }
    }


    public void imprimirContas(Agencia agencia) {
        agencia.imprimirContas();
    }


    public void imprimirConta(int numero) {
        for(Agencia agencia : this.agencias){
            if(agencia.contaExiste(numero)){
                System.out.println("A conta: "+numero+" está na agencia: "+agencia.getNumero());
            }
        }
    }
    
    public boolean depositar(Conta conta,double valor){
        boolean resposta = conta.depositar(valor);
        return resposta;
    }
    public String retirar(Conta conta,double valor){
        String resposta = conta.retirar(valor);
        return resposta;
    }
    
}
