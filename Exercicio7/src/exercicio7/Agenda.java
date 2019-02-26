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
public class Agenda {
    Contato[] contatos = new Contato[10];
    int indice=0;

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
 
    
    public void adicionarContato(Contato[] contato){
         this.contatos = contato;
    }
    
    
    public void buscarContato(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                JOptionPane.showMessageDialog(null, "Contato\n\n" + "Nome: " + contato.getNome() + "\nEmail: " + contato.getEmail());
            } 
        }
    }
    
}
