/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aula4ex5;

/**
 *
 * @author Luiz Ritter
 */
abstract class ContaBancaria {

    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(String num, double saldoInicial) {
        this.numeroConta = num;
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public void consultarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}
