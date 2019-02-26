package exercicio4;

import javax.swing.JOptionPane;


public class Exercicio4 {

    public static void main(String[] args) {
        TrocaNumeros numero = new TrocaNumeros();
        numero.troca(Integer.parseInt(JOptionPane.showInputDialog(null, "a: ")), Integer.parseInt(JOptionPane.showInputDialog(null, "b: ")));
    }
    
}
