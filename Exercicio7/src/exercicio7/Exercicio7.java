/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];
        
        for(int i=0;i<contatos.length;i++){
            contatos[i] = new Contato();
            contatos[i].setNome(JOptionPane.showInputDialog("Qual o nome do seu " + (i+1) + " contato:"));
            contatos[i].setEmail(JOptionPane.showInputDialog("Qual o email do seu " + (i+1) + " contato:"));
        }
        agenda.adicionarContato(contatos);
        agenda.buscarContato(JOptionPane.showInputDialog("Qual o nome do contato que você gostaria de buscar?: "));
        
        
    }
    
}
