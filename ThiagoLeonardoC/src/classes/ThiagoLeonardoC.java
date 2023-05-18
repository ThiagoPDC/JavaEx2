/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import classes.Cliente;
import classes.ContaCorrente;

/**
 *
 * @author tigas
 */
public class ThiagoLeonardoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cliente
        Cliente c1 = new Cliente(1,"Leo");
        //Atribuição e Criação da conta
        ContaCorrente cc1 = new ContaCorrente(c1,"00001-1");
        //Testando o programa
        cc1.getHistorico();
        cc1.depositar(200);
        cc1.getHistorico();
        cc1.saque(100);
        cc1.getHistorico();
        cc1.saque(600);
        cc1.getHistorico();
    }
    
}
