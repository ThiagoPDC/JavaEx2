/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tigas
 */
public class ContaCorrente {
    //Atributos Classe ContaCorrente
    public Date data = new Date();
    DecimalFormat formatacao = new DecimalFormat("###,##0.00");
    private Cliente cliente;
    private String numeroConta;
    private double saldo;
    private String historico;
    private String status;
    
    
    
   public ContaCorrente(Cliente cliente, String numeroConta){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.status = "Ativo";
        historico += ("\nConta criada em : " + data
            + "\nNumero da Conta: " + numeroConta + "\n"
            + "Saldo: " + formatacao.format(saldo) + "\n" 
            + "\nStatus: " + status + "\n"
            + "-----------------------------------------\n");
    }
       
    //Getters and Setters
    public double getSaldo() {
        System.out.println("Saldo Atual: " + saldo);
        return saldo;
    }

    public String getHistorico() {
        System.out.println(historico);
        return historico;
    }
    
    public void depositar(double valor){
        if (valor < 0) {
            System.out.println("O valor de deposito deve ser positivo\n");
        } else {
            saldo += valor;
            System.out.println("Operação realizada");
            historico += ("------" + data + "-------\n"
                + "Deposito: " + valor + " \n"
                + "Saldo: " + valor + "\n"
                + "-----------------------------------------\n");
        }
    }
    
    public void saque(double saque){
        if ((saque * 1.0033) > saldo ) {
            System.out.println("Saldo insuficiente\n");
            historico += ( "------" + data + "-------\n"
                + "Saque negado : " + saque + "\n"
                + "-----------------------------------------\n");
        } else {
            saldo -= saque * 1.0033;
            System.out.println("Operação realizada com sucesso\n");
            historico += ( "------" + data + "-------\n"
                + "Saque: " + saque + " taxa: " + (saque*0.0033) + "\n"
                + "Saldo: " + formatacao.format(saldo) + "\n"
                + "-----------------------------------------\n");
        }
    } 
}
