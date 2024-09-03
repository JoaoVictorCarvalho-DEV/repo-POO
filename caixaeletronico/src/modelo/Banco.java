
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
    
}
