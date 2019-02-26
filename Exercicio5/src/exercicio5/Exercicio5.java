/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparaNumero numero = new ComparaNumero();
        
        numero.compara(Integer.parseInt(JOptionPane.showInputDialog(null, "A:")), Integer.parseInt(JOptionPane.showInputDialog(null, "B:")));
    }
    
}
