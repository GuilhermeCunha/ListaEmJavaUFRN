/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MediaAlunos {
    public double mediaAluno(){
        int media=0;
        int[] notas = new int[Integer.parseInt(JOptionPane.showInputDialog("Quantas notas você irá lançar?"))];
        for(int i=0;i<notas.length;i++){
           notas[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1) + "° nota:"));
           media+=notas[i];
        }
        media/=notas.length;
        System.out.println(media);
        return 0;
    }
    
}
