/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroDecrescente numero = new NumeroDecrescente();
        numero.decrescer(Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva um numero")));
    }
    
}
