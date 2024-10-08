/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 44034660520
 */
public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void setSaldoInicial() {
        this.setSaldo(200);
    }
    
}
